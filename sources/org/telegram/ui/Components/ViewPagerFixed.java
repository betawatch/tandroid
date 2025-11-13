package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.transition.TransitionManager;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Stories.recorder.HintView2;

/* loaded from: classes3.dex */
public class ViewPagerFixed extends FrameLayout {
    private static final Interpolator interpolator = new Interpolator() { // from class: org.telegram.ui.Components.ViewPagerFixed$$ExternalSyntheticLambda0
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float lambda$static$0;
            lambda$static$0 = ViewPagerFixed.lambda$static$0(f);
            return lambda$static$0;
        }
    };
    public Adapter adapter;
    private float additionalOffset;
    private boolean allowDisallowInterceptTouch;
    private boolean animatingForward;
    private boolean backAnimation;
    private float backProgress;
    public int currentPosition;
    public float currentProgress;
    private ValueAnimator manualScrolling;
    private int maximumVelocity;
    private boolean maybeStartTracking;
    protected int nextPosition;
    AnimationNotificationsLocker notificationsLocker;
    private android.graphics.Rect rect;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean startedTracking;
    private int startedTrackingPointerId;
    private int startedTrackingX;
    private int startedTrackingY;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    TabsView tabsView;
    private final float touchSlop;
    ValueAnimator.AnimatorUpdateListener updateTabProgress;
    private VelocityTracker velocityTracker;
    protected View[] viewPages;
    private int[] viewTypes;
    protected SparseArray viewsByType;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    protected void addMoreTabs() {
    }

    protected boolean canScroll(MotionEvent motionEvent) {
        return true;
    }

    protected void invalidateBlur() {
    }

    protected void onBack() {
    }

    protected boolean onBackProgress(float f) {
        return false;
    }

    protected void onItemSelected(View view, View view2, int i, int i2) {
    }

    protected void onScrollEnd() {
    }

    public void onStartTracking() {
    }

    public void onTabAnimationUpdate(boolean z) {
    }

    protected void onTabPageSelected(int i) {
    }

    protected void onTabScrollEnd(int i) {
    }

    protected int tabMarginDp() {
        return 16;
    }

    public float getPositionAnimated() {
        float f;
        View view = this.viewPages[0];
        if (view == null || view.getVisibility() != 0) {
            f = 0.0f;
        } else {
            f = (this.currentPosition * Utilities.clamp(1.0f - Math.abs(this.viewPages[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        }
        View view2 = this.viewPages[1];
        if (view2 == null || view2.getVisibility() != 0) {
            return f;
        }
        return f + (this.nextPosition * Utilities.clamp(1.0f - Math.abs(this.viewPages[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f));
    }

    public float getCurrentPositionAlpha() {
        View view = this.viewPages[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(this.viewPages[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public int getNextPosition() {
        return this.nextPosition;
    }

    public float getNextPositionAlpha() {
        View view = this.viewPages[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(this.viewPages[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    protected float getAvailableTranslationX() {
        return AndroidUtilities.displaySize.x;
    }

    protected boolean canScrollForward(MotionEvent motionEvent) {
        return canScroll(motionEvent);
    }

    public ViewPagerFixed(Context context) {
        this(context, null);
    }

    public ViewPagerFixed(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentProgress = 1.0f;
        this.viewsByType = new SparseArray();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.updateTabProgress = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ViewPagerFixed.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (ViewPagerFixed.this.tabsAnimationInProgress) {
                    float abs = Math.abs(ViewPagerFixed.this.viewPages[0].getTranslationX()) / ViewPagerFixed.this.viewPages[0].getMeasuredWidth();
                    ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
                    float f = 1.0f - abs;
                    viewPagerFixed.currentProgress = f;
                    TabsView tabsView = viewPagerFixed.tabsView;
                    if (tabsView != null) {
                        tabsView.selectTab(viewPagerFixed.nextPosition, viewPagerFixed.currentPosition, f);
                    }
                }
                ViewPagerFixed.this.onTabAnimationUpdate(false);
            }
        };
        this.rect = new android.graphics.Rect();
        this.allowDisallowInterceptTouch = true;
        this.resourcesProvider = resourcesProvider;
        this.touchSlop = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.viewTypes = new int[2];
        this.viewPages = new View[2];
        setClipChildren(true);
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
        this.viewTypes[0] = adapter.getItemViewType(this.currentPosition);
        this.viewPages[0] = adapter.createView(this.viewTypes[0]);
        if (this.viewPages[0] == null && this.currentPosition != 0) {
            this.currentPosition = 0;
            this.viewTypes[0] = adapter.getItemViewType(0);
            this.viewPages[0] = adapter.createView(this.viewTypes[0]);
        }
        adapter.bindView(this.viewPages[0], this.currentPosition, this.viewTypes[0]);
        addView(this.viewPages[0]);
        this.viewPages[0].setVisibility(0);
        fillTabs(false);
    }

    protected void onTabPageSelected(int i, boolean z) {
        onTabPageSelected(i);
    }

    public boolean isManualScrolling() {
        ValueAnimator valueAnimator = this.manualScrolling;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean scrollToPosition(int i) {
        ValueAnimator valueAnimator;
        if (i == this.currentPosition || ((valueAnimator = this.manualScrolling) != null && this.nextPosition == i)) {
            return false;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.manualScrolling = null;
        }
        boolean z = this.currentPosition < i;
        this.animatingForward = z;
        this.nextPosition = i;
        updateViewForIndex(1);
        onTabPageSelected(i, z);
        View view = this.viewPages[0];
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        if (z) {
            setTranslationX(this.viewPages[1], measuredWidth);
        } else {
            setTranslationX(this.viewPages[1], -measuredWidth);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.manualScrolling = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ViewPagerFixed$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ViewPagerFixed.this.lambda$scrollToPosition$1(valueAnimator2);
            }
        });
        this.manualScrolling.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ViewPagerFixed.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
                if (viewPagerFixed.viewPages[1] != null) {
                    viewPagerFixed.swapViews();
                    ViewPagerFixed viewPagerFixed2 = ViewPagerFixed.this;
                    viewPagerFixed2.viewsByType.put(viewPagerFixed2.viewTypes[1], ViewPagerFixed.this.viewPages[1]);
                    ViewPagerFixed viewPagerFixed3 = ViewPagerFixed.this;
                    viewPagerFixed3.removeView(viewPagerFixed3.viewPages[1]);
                    ViewPagerFixed viewPagerFixed4 = ViewPagerFixed.this;
                    viewPagerFixed4.setTranslationX(viewPagerFixed4.viewPages[0], 0.0f);
                    ViewPagerFixed.this.viewPages[1] = null;
                }
                ViewPagerFixed.this.manualScrolling = null;
                ViewPagerFixed.this.onTabAnimationUpdate(true);
                TabsView tabsView = ViewPagerFixed.this.tabsView;
                if (tabsView != null) {
                    tabsView.listView.invalidate();
                    ViewPagerFixed.this.tabsView.listView.invalidateViews();
                    ViewPagerFixed.this.tabsView.invalidate();
                }
                ViewPagerFixed.this.onScrollEnd();
                ViewPagerFixed.this.notificationsLocker.unlock();
            }
        });
        this.manualScrolling.setDuration(540L);
        this.manualScrolling.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.manualScrolling.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scrollToPosition$1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.viewPages[1];
        if (view == null) {
            return;
        }
        if (this.animatingForward) {
            setTranslationX(view, r0[0].getMeasuredWidth() * (1.0f - floatValue));
            setTranslationX(this.viewPages[0], (-r0.getMeasuredWidth()) * floatValue);
        } else {
            setTranslationX(view, (-r0[0].getMeasuredWidth()) * (1.0f - floatValue));
            setTranslationX(this.viewPages[0], r0.getMeasuredWidth() * floatValue);
        }
        this.currentProgress = floatValue;
        onTabAnimationUpdate(true);
        TabsView tabsView = this.tabsView;
        if (tabsView != null) {
            tabsView.listView.invalidate();
            this.tabsView.listView.invalidateViews();
            this.tabsView.invalidate();
        }
    }

    public TabsView createTabsView(boolean z, int i) {
        TabsView tabsView = new TabsView(getContext(), z, i, this.resourcesProvider) { // from class: org.telegram.ui.Components.ViewPagerFixed.3
            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView
            public void selectTab(int i2, int i3, float f) {
                super.selectTab(i2, i3, f);
                ViewPagerFixed.this.onTabPageSelected(f <= 0.5f ? i2 : i3, i2 < i3);
            }
        };
        this.tabsView = tabsView;
        tabsView.tabMarginDp = tabMarginDp();
        this.tabsView.setDelegate(new TabsView.TabsViewDelegate() { // from class: org.telegram.ui.Components.ViewPagerFixed.4
            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView.TabsViewDelegate
            public void onSamePageSelected() {
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView.TabsViewDelegate
            public void onPageSelected(int i2, boolean z2) {
                ViewPagerFixed.this.animatingForward = z2;
                ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
                viewPagerFixed.nextPosition = i2;
                viewPagerFixed.updateViewForIndex(1);
                ViewPagerFixed.this.onTabPageSelected(i2, z2);
                View view = ViewPagerFixed.this.viewPages[0];
                int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
                ViewPagerFixed viewPagerFixed2 = ViewPagerFixed.this;
                View view2 = viewPagerFixed2.viewPages[1];
                if (view2 != null) {
                    if (z2) {
                        viewPagerFixed2.setTranslationX(view2, measuredWidth);
                    } else {
                        viewPagerFixed2.setTranslationX(view2, -measuredWidth);
                    }
                }
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView.TabsViewDelegate
            public boolean needsTab(int i2) {
                Adapter adapter = ViewPagerFixed.this.adapter;
                if (adapter == null) {
                    return true;
                }
                return adapter.needsTab(i2);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView.TabsViewDelegate
            public void onPageScrolled(float f) {
                if (f == 1.0f) {
                    ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
                    if (viewPagerFixed.viewPages[1] != null) {
                        viewPagerFixed.swapViews();
                        ViewPagerFixed viewPagerFixed2 = ViewPagerFixed.this;
                        viewPagerFixed2.viewsByType.put(viewPagerFixed2.viewTypes[1], ViewPagerFixed.this.viewPages[1]);
                        ViewPagerFixed viewPagerFixed3 = ViewPagerFixed.this;
                        viewPagerFixed3.removeView(viewPagerFixed3.viewPages[1]);
                        ViewPagerFixed viewPagerFixed4 = ViewPagerFixed.this;
                        viewPagerFixed4.setTranslationX(viewPagerFixed4.viewPages[0], 0.0f);
                        ViewPagerFixed.this.viewPages[1] = null;
                    }
                    ViewPagerFixed viewPagerFixed5 = ViewPagerFixed.this;
                    viewPagerFixed5.onTabScrollEnd(viewPagerFixed5.currentPosition);
                    return;
                }
                ViewPagerFixed viewPagerFixed6 = ViewPagerFixed.this;
                if (viewPagerFixed6.viewPages[1] == null) {
                    return;
                }
                if (viewPagerFixed6.animatingForward) {
                    ViewPagerFixed viewPagerFixed7 = ViewPagerFixed.this;
                    viewPagerFixed7.setTranslationX(viewPagerFixed7.viewPages[1], r4[0].getMeasuredWidth() * (1.0f - f));
                    ViewPagerFixed viewPagerFixed8 = ViewPagerFixed.this;
                    viewPagerFixed8.setTranslationX(viewPagerFixed8.viewPages[0], (-r2.getMeasuredWidth()) * f);
                } else {
                    ViewPagerFixed viewPagerFixed9 = ViewPagerFixed.this;
                    viewPagerFixed9.setTranslationX(viewPagerFixed9.viewPages[1], (-r4[0].getMeasuredWidth()) * (1.0f - f));
                    ViewPagerFixed viewPagerFixed10 = ViewPagerFixed.this;
                    viewPagerFixed10.setTranslationX(viewPagerFixed10.viewPages[0], r2.getMeasuredWidth() * f);
                }
                ViewPagerFixed.this.onTabAnimationUpdate(false);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView.TabsViewDelegate
            public boolean canPerformActions() {
                return (ViewPagerFixed.this.tabsAnimationInProgress || ViewPagerFixed.this.startedTracking) ? false : true;
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView.TabsViewDelegate
            public void invalidateBlur() {
                ViewPagerFixed.this.invalidateBlur();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView.TabsViewDelegate
            public boolean canReorder(int i2) {
                Adapter adapter = ViewPagerFixed.this.adapter;
                if (adapter == null) {
                    return false;
                }
                return adapter.canReorder(i2);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.TabsView.TabsViewDelegate
            public void applyReorder(ArrayList arrayList) {
                Adapter adapter = ViewPagerFixed.this.adapter;
                if (adapter == null) {
                    return;
                }
                adapter.applyReorder(arrayList);
            }
        });
        fillTabs(false);
        return this.tabsView;
    }

    protected ValueAnimator translateAnimator(final View view, final float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ViewPagerFixed.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewPagerFixed.this.setTranslationX(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ViewPagerFixed.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewPagerFixed.this.setTranslationX(view, f);
            }
        });
        return ofFloat;
    }

    protected void setTranslationX(View view, float f) {
        view.setTranslationX(f);
    }

    public boolean isTouch() {
        return this.startedTracking;
    }

    public void resetTouch() {
        if (this.startedTracking) {
            this.maybeStartTracking = true;
            this.startedTracking = false;
            setTranslationX(this.viewPages[0], 0.0f);
            View view = this.viewPages[1];
            if (view != null) {
                setTranslationX(view, this.animatingForward ? r2[0].getMeasuredWidth() : -r2[0].getMeasuredWidth());
            }
            this.nextPosition = 0;
            this.currentProgress = 1.0f;
            TabsView tabsView = this.tabsView;
            if (tabsView != null) {
                tabsView.selectTab(0, this.currentPosition, 1.0f);
            }
            onTabAnimationUpdate(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateViewForIndex(int i) {
        int i2 = i == 0 ? this.currentPosition : this.nextPosition;
        if (i2 < 0 || i2 >= this.adapter.getItemCount()) {
            return;
        }
        if (this.viewPages[i] == null) {
            this.viewTypes[i] = this.adapter.getItemViewType(i2);
            View view = (View) this.viewsByType.get(this.viewTypes[i]);
            if (view == null) {
                view = this.adapter.createView(this.viewTypes[i]);
            } else {
                this.viewsByType.remove(this.viewTypes[i]);
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            this.viewPages[i] = view;
            this.adapter.bindView(view, i2, this.viewTypes[i]);
            this.viewPages[i].setVisibility(0);
            return;
        }
        if (this.viewTypes[i] == this.adapter.getItemViewType(i2)) {
            this.adapter.bindView(this.viewPages[i], i2, this.viewTypes[i]);
            this.viewPages[i].setVisibility(0);
            return;
        }
        this.viewsByType.put(this.viewTypes[i], this.viewPages[i]);
        this.viewPages[i].setVisibility(8);
        removeView(this.viewPages[i]);
        this.viewTypes[i] = this.adapter.getItemViewType(i2);
        View view2 = (View) this.viewsByType.get(this.viewTypes[i]);
        if (view2 == null) {
            view2 = this.adapter.createView(this.viewTypes[i]);
        } else {
            this.viewsByType.remove(this.viewTypes[i]);
        }
        addView(view2);
        this.viewPages[i] = view2;
        view2.setVisibility(0);
        Adapter adapter = this.adapter;
        adapter.bindView(this.viewPages[i], i2, adapter.getItemViewType(i2));
    }

    public void fillTabs(boolean z) {
        TabsView tabsView;
        if (this.adapter == null || (tabsView = this.tabsView) == null) {
            return;
        }
        tabsView.removeTabs();
        for (int i = 0; i < this.adapter.getItemCount(); i++) {
            if (this.adapter.needsTab(i)) {
                this.tabsView.addTab(this.adapter.getItemId(i), this.adapter.getItemTitle(i));
            }
        }
        addMoreTabs();
        if (z) {
            TransitionManager.beginDelayedTransition(this.tabsView.listView, TransitionExt.createSimpleTransition());
        }
        this.tabsView.finishAddingTabs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (onBackProgress(0.0f) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
        if (!z && this.currentPosition == 0) {
            this.backProgress = 0.0f;
        }
        if ((z && this.currentPosition == this.adapter.getItemCount() - 1) || this.manualScrolling != null || !canScroll(motionEvent)) {
            return false;
        }
        if (z && !canScrollForward(motionEvent)) {
            return false;
        }
        Adapter adapter = this.adapter;
        if (adapter != null) {
            if (!adapter.canScrollTo(this.currentPosition + (z ? 1 : -1))) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.maybeStartTracking = false;
        this.startedTracking = true;
        onStartTracking();
        this.startedTrackingX = (int) (motionEvent.getX() + this.additionalOffset);
        TabsView tabsView = this.tabsView;
        if (tabsView != null) {
            tabsView.setEnabled(false);
        }
        this.notificationsLocker.lock();
        this.animatingForward = z;
        this.nextPosition = this.currentPosition + (z ? 1 : -1);
        updateViewForIndex(1);
        View view = this.viewPages[1];
        if (view != null) {
            if (z) {
                setTranslationX(view, r7[0].getMeasuredWidth());
            } else {
                setTranslationX(view, -r7[0].getMeasuredWidth());
            }
        }
        onTabAnimationUpdate(false);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TabsView tabsView = this.tabsView;
        if (tabsView != null && tabsView.isAnimatingIndicator()) {
            return false;
        }
        if (checkTabsAnimationInProgress()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.startedTracking;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.allowDisallowInterceptTouch && this.maybeStartTracking && !this.startedTracking) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouchEventInternal(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x02a1, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEventInternal(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        int measuredWidth;
        boolean z;
        View findScrollingChild;
        TabsView tabsView = this.tabsView;
        if (tabsView != null && tabsView.animatingIndicator) {
            return false;
        }
        if (motionEvent != null) {
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && checkTabsAnimationInProgress()) {
            this.startedTracking = true;
            onStartTracking();
            this.startedTrackingPointerId = motionEvent.getPointerId(0);
            int x = (int) motionEvent.getX();
            this.startedTrackingX = x;
            if (!this.animatingForward) {
                if (this.viewPages[1] != null) {
                    if (x < r5.getMeasuredWidth() + this.viewPages[1].getTranslationX()) {
                        swapViews();
                        this.animatingForward = true;
                        this.additionalOffset = this.viewPages[0].getTranslationX();
                    } else {
                        this.additionalOffset = this.viewPages[0].getTranslationX();
                    }
                }
            } else if (x < this.viewPages[0].getMeasuredWidth() + this.viewPages[0].getTranslationX()) {
                this.additionalOffset = this.viewPages[0].getTranslationX();
            } else {
                swapViews();
                this.animatingForward = false;
                this.additionalOffset = this.viewPages[0].getTranslationX();
            }
            this.tabsAnimation.removeAllListeners();
            this.tabsAnimation.cancel();
            this.tabsAnimationInProgress = false;
        } else if (motionEvent != null && motionEvent.getAction() == 0) {
            this.additionalOffset = 0.0f;
        }
        if (!this.startedTracking && motionEvent != null && (findScrollingChild = findScrollingChild(this, motionEvent.getX(), motionEvent.getY())) != null && (findScrollingChild.canScrollHorizontally(1) || findScrollingChild.canScrollHorizontally(-1))) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking) {
            this.startedTrackingPointerId = motionEvent.getPointerId(0);
            this.maybeStartTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            this.startedTrackingY = (int) motionEvent.getY();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
            int x2 = (int) ((motionEvent.getX() - this.startedTrackingX) + this.additionalOffset);
            int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
            if (this.startedTracking && (((z = this.animatingForward) && x2 > 0) || (!z && x2 < 0))) {
                if (!prepareForMoving(motionEvent, x2 < 0)) {
                    this.maybeStartTracking = true;
                    this.startedTracking = false;
                    setTranslationX(this.viewPages[0], 0.0f);
                    View view = this.viewPages[1];
                    if (view != null) {
                        setTranslationX(view, this.animatingForward ? r2[0].getMeasuredWidth() : -r2[0].getMeasuredWidth());
                    }
                    this.nextPosition = 0;
                    this.currentProgress = 1.0f;
                    TabsView tabsView2 = this.tabsView;
                    if (tabsView2 != null) {
                        tabsView2.selectTab(0, this.currentPosition, 1.0f);
                    }
                    onTabAnimationUpdate(false);
                }
            }
            if (this.maybeStartTracking && !this.startedTracking) {
                int x3 = (int) (motionEvent.getX() - this.startedTrackingX);
                if (Math.abs(x3) >= this.touchSlop && Math.abs(x3) > abs) {
                    prepareForMoving(motionEvent, x2 < 0);
                }
            } else if (this.startedTracking) {
                float abs2 = Math.abs(x2) / this.viewPages[0].getMeasuredWidth();
                if (this.nextPosition == -1) {
                    this.backProgress = abs2;
                    onBackProgress(abs2);
                } else {
                    setTranslationX(this.viewPages[0], x2);
                    View view2 = this.viewPages[1];
                    if (view2 != null) {
                        if (this.animatingForward) {
                            setTranslationX(view2, r2[0].getMeasuredWidth() + x2);
                        } else {
                            setTranslationX(view2, x2 - r2[0].getMeasuredWidth());
                        }
                    }
                }
                float f4 = 1.0f - abs2;
                this.currentProgress = f4;
                TabsView tabsView3 = this.tabsView;
                if (tabsView3 != null) {
                    tabsView3.selectTab(this.nextPosition, this.currentPosition, f4);
                }
                onTabAnimationUpdate(false);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.maximumVelocity);
            }
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = this.velocityTracker.getXVelocity();
                f2 = this.velocityTracker.getYVelocity();
                if (!this.startedTracking && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    prepareForMoving(motionEvent, f < 0.0f);
                }
            }
            if (this.startedTracking) {
                float x4 = this.viewPages[0].getX();
                this.tabsAnimation = new AnimatorSet();
                if (this.additionalOffset == 0.0f) {
                    this.backAnimation = Math.abs(x4) < ((float) this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                } else if (Math.abs(f) > 1500.0f) {
                    boolean z2 = this.animatingForward ? false : false;
                    this.backAnimation = z2;
                } else if (this.animatingForward) {
                    View view3 = this.viewPages[1];
                    if (view3 != null) {
                        this.backAnimation = view3.getX() > ((float) (this.viewPages[0].getMeasuredWidth() >> 1));
                    } else {
                        this.backAnimation = false;
                    }
                } else {
                    this.backAnimation = this.viewPages[0].getX() < ((float) (this.viewPages[0].getMeasuredWidth() >> 1));
                }
                if (this.backAnimation) {
                    f3 = Math.abs(x4);
                    if (this.animatingForward) {
                        this.tabsAnimation.playTogether(translateAnimator(this.viewPages[0], 0.0f));
                        View view4 = this.viewPages[1];
                        if (view4 != null) {
                            this.tabsAnimation.playTogether(translateAnimator(view4, view4.getMeasuredWidth()));
                        }
                    } else {
                        this.tabsAnimation.playTogether(translateAnimator(this.viewPages[0], 0.0f));
                        View view5 = this.viewPages[1];
                        if (view5 != null) {
                            this.tabsAnimation.playTogether(translateAnimator(view5, -view5.getMeasuredWidth()));
                        }
                    }
                } else if (this.nextPosition >= 0) {
                    f3 = this.viewPages[0].getMeasuredWidth() - Math.abs(x4);
                    if (this.animatingForward) {
                        this.tabsAnimation.playTogether(translateAnimator(this.viewPages[0], -r7.getMeasuredWidth()));
                        View view6 = this.viewPages[1];
                        if (view6 != null) {
                            this.tabsAnimation.playTogether(translateAnimator(view6, 0.0f));
                        }
                    } else {
                        this.tabsAnimation.playTogether(translateAnimator(this.viewPages[0], r7.getMeasuredWidth()));
                        View view7 = this.viewPages[1];
                        if (view7 != null) {
                            this.tabsAnimation.playTogether(translateAnimator(view7, 0.0f));
                        }
                    }
                } else {
                    f3 = 0.0f;
                }
                if (this.nextPosition < 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.backProgress, this.backAnimation ? 0.0f : 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ViewPagerFixed$$ExternalSyntheticLambda1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ViewPagerFixed.this.lambda$onTouchEventInternal$2(valueAnimator);
                        }
                    });
                    this.tabsAnimation.playTogether(ofFloat);
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(this.updateTabProgress);
                this.tabsAnimation.playTogether(ofFloat2);
                this.tabsAnimation.setInterpolator(interpolator);
                int measuredWidth2 = getMeasuredWidth();
                float f5 = measuredWidth2 / 2;
                float distanceInfluenceForSnapDuration = f5 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (f3 * 1.0f) / measuredWidth2)) * f5);
                float abs3 = Math.abs(f);
                if (abs3 > 0.0f) {
                    measuredWidth = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs3) * 1000.0f) * 4;
                } else {
                    measuredWidth = (int) (((f3 / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.tabsAnimation.setDuration(Math.max(150, Math.min(measuredWidth, 600)));
                this.tabsAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ViewPagerFixed.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ViewPagerFixed.this.tabsAnimation = null;
                        ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
                        if (viewPagerFixed.nextPosition < 0) {
                            viewPagerFixed.onBack();
                        }
                        ViewPagerFixed viewPagerFixed2 = ViewPagerFixed.this;
                        if (viewPagerFixed2.viewPages[1] != null) {
                            if (!viewPagerFixed2.backAnimation) {
                                ViewPagerFixed.this.swapViews();
                            }
                            ViewPagerFixed viewPagerFixed3 = ViewPagerFixed.this;
                            viewPagerFixed3.viewsByType.put(viewPagerFixed3.viewTypes[1], ViewPagerFixed.this.viewPages[1]);
                            ViewPagerFixed viewPagerFixed4 = ViewPagerFixed.this;
                            viewPagerFixed4.removeView(viewPagerFixed4.viewPages[1]);
                            ViewPagerFixed.this.viewPages[1].setVisibility(8);
                            ViewPagerFixed.this.viewPages[1] = null;
                        }
                        ViewPagerFixed.this.tabsAnimationInProgress = false;
                        ViewPagerFixed.this.maybeStartTracking = false;
                        TabsView tabsView4 = ViewPagerFixed.this.tabsView;
                        if (tabsView4 != null) {
                            tabsView4.setEnabled(true);
                        }
                        ViewPagerFixed.this.onTabAnimationUpdate(false);
                        ViewPagerFixed.this.onScrollEnd();
                        ViewPagerFixed.this.notificationsLocker.unlock();
                    }
                });
                this.tabsAnimation.start();
                this.tabsAnimationInProgress = true;
                this.startedTracking = false;
                onTabAnimationUpdate(false);
            } else {
                this.maybeStartTracking = false;
                TabsView tabsView4 = this.tabsView;
                if (tabsView4 != null) {
                    tabsView4.setEnabled(true);
                }
            }
            VelocityTracker velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.velocityTracker = null;
            }
        }
        return this.startedTracking || this.maybeStartTracking;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTouchEventInternal$2(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.backProgress = floatValue;
        onBackProgress(floatValue);
    }

    protected void swapViews() {
        View[] viewArr = this.viewPages;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i = this.currentPosition;
        int i2 = this.nextPosition;
        this.currentPosition = i2;
        this.nextPosition = i;
        this.currentProgress = 1.0f - this.currentProgress;
        int[] iArr = this.viewTypes;
        int i3 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i3;
        onItemSelected(view2, view, i2, i);
    }

    public boolean checkTabsAnimationInProgress() {
        boolean z;
        if (!this.tabsAnimationInProgress) {
            return false;
        }
        if (this.backAnimation) {
            if (Math.abs(this.viewPages[0].getTranslationX()) < 1.0f) {
                setTranslationX(this.viewPages[0], 0.0f);
                View view = this.viewPages[1];
                if (view != null) {
                    setTranslationX(view, r0[0].getMeasuredWidth() * (this.animatingForward ? 1 : -1));
                }
                z = true;
            }
            z = false;
        } else {
            if (Math.abs(this.viewPages[1].getTranslationX()) < 1.0f) {
                setTranslationX(this.viewPages[0], r0.getMeasuredWidth() * (this.animatingForward ? -1 : 1));
                View view2 = this.viewPages[1];
                if (view2 != null) {
                    setTranslationX(view2, 0.0f);
                }
                z = true;
            }
            z = false;
        }
        onTabAnimationUpdate(true);
        if (z) {
            AnimatorSet animatorSet = this.tabsAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.tabsAnimation = null;
            }
            this.tabsAnimationInProgress = false;
        }
        return this.tabsAnimationInProgress;
    }

    public static float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public void setPosition(int i) {
        if (this.adapter == null) {
            this.currentPosition = i;
            onTabAnimationUpdate(false);
        }
        AnimatorSet animatorSet = this.tabsAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View view = this.viewPages[1];
        if (view != null) {
            this.viewsByType.put(this.viewTypes[1], view);
            removeView(this.viewPages[1]);
            this.viewPages[1] = null;
        }
        int i2 = this.currentPosition;
        if (i2 != i) {
            this.currentPosition = i;
            this.nextPosition = 0;
            this.currentProgress = 1.0f;
            View view2 = this.viewPages[0];
            updateViewForIndex(0);
            onItemSelected(this.viewPages[0], view2, this.currentPosition, i2);
            setTranslationX(this.viewPages[0], 0.0f);
            TabsView tabsView = this.tabsView;
            if (tabsView != null) {
                tabsView.selectTab(this.currentPosition, this.nextPosition, this.currentProgress);
            }
            onTabAnimationUpdate(true);
        }
    }

    public void updateCurrent() {
        if (this.viewTypes[0] != this.adapter.getItemViewType(this.currentPosition)) {
            updateViewForIndex(0);
            View view = this.viewPages[1];
            if (view != null) {
                this.viewsByType.put(this.viewTypes[1], view);
                removeView(this.viewPages[1]);
                this.viewPages[1] = null;
            }
            setTranslationX(this.viewPages[0], 0.0f);
            onTabAnimationUpdate(true);
        }
    }

    public View[] getViewPages() {
        return this.viewPages;
    }

    public boolean isCurrentTabFirst() {
        return this.currentPosition == 0;
    }

    public void rebuild(boolean z) {
        onTouchEvent(null);
        if (!this.adapter.hasStableId()) {
            z = false;
        }
        AnimatorSet animatorSet = this.tabsAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.tabsAnimation = null;
        }
        View view = this.viewPages[1];
        if (view != null) {
            removeView(view);
            this.viewPages[1] = null;
        }
        View[] viewArr = this.viewPages;
        View view2 = viewArr[0];
        viewArr[1] = view2;
        int intValue = (view2 == null || view2.getTag() == null) ? 0 : ((Integer) this.viewPages[1].getTag()).intValue();
        if (this.adapter.getItemCount() == 0) {
            View view3 = this.viewPages[1];
            if (view3 != null) {
                removeView(view3);
                this.viewPages[1] = null;
            }
            View view4 = this.viewPages[0];
            if (view4 != null) {
                removeView(view4);
                this.viewPages[0] = null;
                return;
            }
            return;
        }
        if (this.currentPosition > this.adapter.getItemCount() - 1) {
            this.currentPosition = this.adapter.getItemCount() - 1;
        }
        if (this.currentPosition < 0) {
            this.currentPosition = 0;
        }
        this.viewTypes[0] = this.adapter.getItemViewType(this.currentPosition);
        this.viewPages[0] = this.adapter.createView(this.viewTypes[0]);
        this.adapter.bindView(this.viewPages[0], this.currentPosition, this.viewTypes[0]);
        addView(this.viewPages[0]);
        this.viewPages[0].setVisibility(0);
        if ((this.viewPages[0].getTag() == null ? 0 : ((Integer) this.viewPages[0].getTag()).intValue()) == intValue) {
            z = false;
        }
        if (z) {
            this.tabsView.saveFromValues();
        }
        fillTabs(z);
        if (z) {
            this.tabsAnimation = new AnimatorSet();
            View view5 = this.viewPages[1];
            if (view5 != null) {
                setTranslationX(view5, 0.0f);
            }
            View view6 = this.viewPages[0];
            if (view6 != null) {
                setTranslationX(view6, -getMeasuredWidth());
            }
            View view7 = this.viewPages[1];
            if (view7 != null) {
                this.tabsAnimation.playTogether(translateAnimator(view7, getMeasuredWidth()));
            }
            View view8 = this.viewPages[0];
            if (view8 != null) {
                this.tabsAnimation.playTogether(translateAnimator(view8, 0.0f));
            }
            onTabAnimationUpdate(true);
            this.tabsView.indicatorProgress2 = 0.0f;
            this.tabsView.listView.invalidateViews();
            this.tabsView.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ViewPagerFixed$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ViewPagerFixed.this.lambda$rebuild$3(valueAnimator);
                }
            });
            this.tabsAnimation.playTogether(ofFloat);
            this.tabsAnimation.setInterpolator(interpolator);
            this.tabsAnimation.setDuration(220L);
            this.tabsAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ViewPagerFixed.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ViewPagerFixed.this.tabsAnimation = null;
                    ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
                    View view9 = viewPagerFixed.viewPages[1];
                    if (view9 != null) {
                        viewPagerFixed.removeView(view9);
                        ViewPagerFixed.this.viewPages[1] = null;
                    }
                    ViewPagerFixed.this.tabsAnimationInProgress = false;
                    TabsView tabsView = ViewPagerFixed.this.tabsView;
                    if (tabsView != null) {
                        tabsView.setEnabled(true);
                        ViewPagerFixed.this.tabsView.animatingIndicator = false;
                        ViewPagerFixed.this.tabsView.indicatorProgress2 = 1.0f;
                        ViewPagerFixed.this.tabsView.listView.invalidateViews();
                        ViewPagerFixed.this.tabsView.invalidate();
                    }
                }
            });
            this.tabsView.setEnabled(false);
            this.tabsAnimationInProgress = true;
            this.tabsAnimation.start();
            return;
        }
        View view9 = this.viewPages[1];
        if (view9 != null) {
            removeView(view9);
            this.viewPages[1] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$rebuild$3(ValueAnimator valueAnimator) {
        this.updateTabProgress.onAnimationUpdate(valueAnimator);
        this.tabsView.indicatorProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.tabsView.listView.invalidateViews();
        this.tabsView.invalidate();
    }

    public void clearViews() {
        this.viewsByType.clear();
    }

    public static abstract class Adapter {
        public void applyReorder(ArrayList arrayList) {
        }

        public abstract void bindView(View view, int i, int i2);

        public boolean canReorder(int i) {
            return false;
        }

        public boolean canScrollTo(int i) {
            return true;
        }

        public abstract View createView(int i);

        public abstract int getItemCount();

        public int getItemId(int i) {
            return i;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public boolean hasStableId() {
            return false;
        }

        public boolean needsTab(int i) {
            return true;
        }

        public CharSequence getItemTitle(int i) {
            return "";
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (i == 0) {
            return false;
        }
        if (!this.tabsAnimationInProgress && !this.startedTracking) {
            boolean z = i > 0;
            if ((!z && this.currentPosition == 0) || (z && this.currentPosition == this.adapter.getItemCount() - 1)) {
                return false;
            }
        }
        return true;
    }

    public View getCurrentView() {
        return this.viewPages[0];
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void cancelTouches() {
        float f;
        int measuredWidth;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.maximumVelocity);
        }
        if (this.startedTracking) {
            float x = this.viewPages[0].getX();
            this.tabsAnimation = new AnimatorSet();
            if (this.additionalOffset == 0.0f) {
                this.backAnimation = Math.abs(x) < ((float) this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f));
            } else if (Math.abs(0.0f) > 1500.0f) {
                this.backAnimation = false;
            } else if (this.animatingForward) {
                View view = this.viewPages[1];
                if (view != null) {
                    this.backAnimation = view.getX() > ((float) (this.viewPages[0].getMeasuredWidth() >> 1));
                } else {
                    this.backAnimation = false;
                }
            } else {
                this.backAnimation = this.viewPages[0].getX() < ((float) (this.viewPages[0].getMeasuredWidth() >> 1));
            }
            if (this.backAnimation) {
                f = Math.abs(x);
                if (this.animatingForward) {
                    this.tabsAnimation.playTogether(translateAnimator(this.viewPages[0], 0.0f));
                    View view2 = this.viewPages[1];
                    if (view2 != null) {
                        this.tabsAnimation.playTogether(translateAnimator(view2, view2.getMeasuredWidth()));
                    }
                } else {
                    this.tabsAnimation.playTogether(translateAnimator(this.viewPages[0], 0.0f));
                    View view3 = this.viewPages[1];
                    if (view3 != null) {
                        this.tabsAnimation.playTogether(translateAnimator(view3, -view3.getMeasuredWidth()));
                    }
                }
            } else if (this.nextPosition >= 0) {
                f = this.viewPages[0].getMeasuredWidth() - Math.abs(x);
                if (this.animatingForward) {
                    this.tabsAnimation.playTogether(translateAnimator(this.viewPages[0], -r6.getMeasuredWidth()));
                    View view4 = this.viewPages[1];
                    if (view4 != null) {
                        this.tabsAnimation.playTogether(translateAnimator(view4, 0.0f));
                    }
                } else {
                    this.tabsAnimation.playTogether(translateAnimator(this.viewPages[0], r6.getMeasuredWidth()));
                    View view5 = this.viewPages[1];
                    if (view5 != null) {
                        this.tabsAnimation.playTogether(translateAnimator(view5, 0.0f));
                    }
                }
            } else {
                f = 0.0f;
            }
            if (this.nextPosition < 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.backProgress, this.backAnimation ? 0.0f : 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ViewPagerFixed$$ExternalSyntheticLambda4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewPagerFixed.this.lambda$cancelTouches$4(valueAnimator);
                    }
                });
                this.tabsAnimation.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.updateTabProgress);
            this.tabsAnimation.playTogether(ofFloat2);
            this.tabsAnimation.setInterpolator(interpolator);
            int measuredWidth2 = getMeasuredWidth();
            float f2 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (f * 1.0f) / measuredWidth2)) * f2);
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
            } else {
                measuredWidth = (int) (((f / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.tabsAnimation.setDuration(Math.max(150, Math.min(measuredWidth, 600)));
            this.tabsAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ViewPagerFixed.9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ViewPagerFixed.this.tabsAnimation = null;
                    ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
                    if (viewPagerFixed.nextPosition < 0) {
                        viewPagerFixed.onBack();
                    }
                    ViewPagerFixed viewPagerFixed2 = ViewPagerFixed.this;
                    if (viewPagerFixed2.viewPages[1] != null) {
                        if (!viewPagerFixed2.backAnimation) {
                            ViewPagerFixed.this.swapViews();
                        }
                        ViewPagerFixed viewPagerFixed3 = ViewPagerFixed.this;
                        viewPagerFixed3.viewsByType.put(viewPagerFixed3.viewTypes[1], ViewPagerFixed.this.viewPages[1]);
                        ViewPagerFixed viewPagerFixed4 = ViewPagerFixed.this;
                        viewPagerFixed4.removeView(viewPagerFixed4.viewPages[1]);
                        ViewPagerFixed.this.viewPages[1].setVisibility(8);
                        ViewPagerFixed.this.viewPages[1] = null;
                    }
                    ViewPagerFixed.this.tabsAnimationInProgress = false;
                    ViewPagerFixed.this.maybeStartTracking = false;
                    TabsView tabsView = ViewPagerFixed.this.tabsView;
                    if (tabsView != null) {
                        tabsView.setEnabled(true);
                    }
                    ViewPagerFixed.this.onTabAnimationUpdate(false);
                    ViewPagerFixed.this.onScrollEnd();
                    ViewPagerFixed.this.notificationsLocker.unlock();
                }
            });
            this.tabsAnimation.start();
            this.tabsAnimationInProgress = true;
            this.startedTracking = false;
            onTabAnimationUpdate(false);
        } else {
            this.maybeStartTracking = false;
            TabsView tabsView = this.tabsView;
            if (tabsView != null) {
                tabsView.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelTouches$4(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.backProgress = floatValue;
        onBackProgress(floatValue);
    }

    public static class TabsView extends FrameLayout {
        private int activeTextColorKey;
        public ListAdapter adapter;
        private int additionalTabWidth;
        private int allTabsWidth;
        private boolean animatingIndicator;
        private float animatingIndicatorProgress;
        private Runnable animationRunnable;
        private float animationTime;
        private int backgroundColorKey;
        private final Paint counterPaint;
        private int currentPosition;
        private TabsViewDelegate delegate;
        private final Paint deletePaint;
        private float editingAnimationProgress;
        private boolean editingForwardAnimation;
        private float editingStartAnimationProgress;
        private float hideProgress;
        private SparseIntArray idToPosition;
        private boolean ignoreLayout;
        private float indicatorProgress2;
        private CubicBezierInterpolator interpolator;
        private boolean invalidated;
        private boolean isEditing;
        private boolean isInHiddenMode;
        private DefaultItemAnimator itemAnimator;
        private ItemTouchHelper itemTouchHelper;
        private long lastAnimationTime;
        float lastDrawnIndicatorW;
        float lastDrawnIndicatorX;
        public LinearLayoutManager layoutManager;
        public RecyclerListView listView;
        private int manualScrollingToId;
        private int manualScrollingToPosition;
        private Utilities.Callback2Return onTabLongClick;
        private boolean orderChanged;
        private float overrideFromW;
        private float overrideFromX;
        private SparseIntArray positionToId;
        private SparseIntArray positionToWidth;
        private SparseIntArray positionToX;
        private Utilities.Callback2Return preTabClick;
        private int prevLayoutWidth;
        private int previousId;
        private int previousPosition;
        private boolean reordering;
        private Theme.ResourcesProvider resourcesProvider;
        private int scrollingToChild;
        private int selectedTabId;
        private int selectorColorKey;
        private GradientDrawable selectorDrawable;
        private final Paint selectorPaint;
        private int selectorType;
        private int tabLineColorKey;
        public int tabMarginDp;
        private final ArrayList tabs;
        ValueAnimator tabsAnimator;
        private final TextPaint textCounterPaint;
        private final TextPaint textPaint;
        private int unactiveTextColorKey;

        public interface TabsViewDelegate {
            void applyReorder(ArrayList arrayList);

            boolean canPerformActions();

            boolean canReorder(int i);

            void invalidateBlur();

            boolean needsTab(int i);

            void onPageScrolled(float f);

            void onPageSelected(int i, boolean z);

            void onSamePageSelected();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setIsEditing$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        static /* synthetic */ float access$3116(TabsView tabsView, float f) {
            float f2 = tabsView.animationTime + f;
            tabsView.animationTime = f2;
            return f2;
        }

        public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
            this.onTabLongClick = callback2Return;
        }

        private static class Tab {
            public float alpha = 1.0f;
            public int counter;
            public int id;
            public CharSequence title;
            public int titleWidth;

            public Tab(int i, CharSequence charSequence) {
                this.id = i;
                this.title = charSequence;
            }

            public int getWidth(boolean z, TextPaint textPaint) {
                int ceil = (int) Math.ceil(HintView2.measureCorrectly(this.title, textPaint));
                this.titleWidth = ceil;
                return Math.max(0, ceil);
            }
        }

        public class TabView extends View {
            private int currentPosition;
            private Tab currentTab;
            private CharSequence currentText;
            private RectF rect;
            private boolean reordering;
            private final AnimatedFloat shakeAlpha;
            private Shaker shaker;
            private int tabWidth;
            private Text text;
            private int textOffsetX;

            public void setReordering(boolean z) {
                if (this.reordering == z) {
                    return;
                }
                this.reordering = z;
                invalidate();
            }

            public TabView(Context context) {
                super(context);
                this.rect = new RectF();
                this.shakeAlpha = new AnimatedFloat(this, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            public void setTab(Tab tab, int i) {
                this.currentTab = tab;
                this.currentPosition = i;
                setContentDescription(tab.title);
                setAlpha(tab.alpha);
                requestLayout();
            }

            @Override // android.view.View
            public int getId() {
                return this.currentTab.id;
            }

            @Override // android.view.View
            protected void onMeasure(int i, int i2) {
                setMeasuredDimension(this.currentTab.getWidth(false, TabsView.this.textPaint) + AndroidUtilities.dp(TabsView.this.tabMarginDp * 2) + TabsView.this.additionalTabWidth, View.MeasureSpec.getSize(i2));
            }

            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                String str;
                int i8;
                int i9;
                int i10;
                int i11;
                String str2;
                int i12;
                int i13;
                canvas.save();
                float f = this.shakeAlpha.set(this.reordering);
                if (f > 0.0f) {
                    if (this.shaker == null) {
                        this.shaker = new Shaker(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    this.shaker.concat(canvas, f);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                if (this.currentTab.id != Integer.MAX_VALUE && TabsView.this.editingAnimationProgress != 0.0f) {
                    canvas.save();
                    float f2 = TabsView.this.editingAnimationProgress * (this.currentPosition % 2 == 0 ? 1.0f : -1.0f);
                    canvas.translate(AndroidUtilities.dp(0.66f) * f2, 0.0f);
                    canvas.rotate(f2, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
                }
                if (TabsView.this.manualScrollingToId != -1) {
                    i = TabsView.this.manualScrollingToId;
                    i2 = TabsView.this.selectedTabId;
                } else {
                    i = TabsView.this.selectedTabId;
                    i2 = TabsView.this.previousId;
                }
                int i14 = i;
                int i15 = i2;
                if (this.currentTab.id == i14) {
                    i3 = TabsView.this.activeTextColorKey;
                    i4 = TabsView.this.unactiveTextColorKey;
                    i5 = Theme.key_chats_tabUnreadActiveBackground;
                    i6 = Theme.key_chats_tabUnreadUnactiveBackground;
                } else {
                    i3 = TabsView.this.unactiveTextColorKey;
                    i4 = TabsView.this.activeTextColorKey;
                    i5 = Theme.key_chats_tabUnreadUnactiveBackground;
                    i6 = Theme.key_chats_tabUnreadActiveBackground;
                }
                int i16 = i5;
                int i17 = i6;
                if (TabsView.this.selectorType == 9) {
                    TabsView.this.textPaint.setColor(Theme.getColor(TabsView.this.unactiveTextColorKey, TabsView.this.resourcesProvider));
                } else if ((TabsView.this.animatingIndicator || TabsView.this.manualScrollingToId != -1) && ((i7 = this.currentTab.id) == i14 || i7 == i15)) {
                    TabsView.this.textPaint.setColor(ColorUtils.blendARGB(Theme.getColor(i4, TabsView.this.resourcesProvider), Theme.getColor(i3, TabsView.this.resourcesProvider), TabsView.this.animatingIndicatorProgress));
                } else {
                    TabsView.this.textPaint.setColor(Theme.getColor(i3, TabsView.this.resourcesProvider));
                }
                int i18 = this.currentTab.counter;
                if (i18 > 0) {
                    String format = String.format("%d", Integer.valueOf(i18));
                    int ceil = (int) Math.ceil(TabsView.this.textCounterPaint.measureText(format));
                    i9 = ceil;
                    str = format;
                    i8 = Math.max(AndroidUtilities.dp(10.0f), ceil) + AndroidUtilities.dp(10.0f);
                } else {
                    str = null;
                    i8 = 0;
                    i9 = 0;
                }
                if (this.currentTab.id != Integer.MAX_VALUE && (TabsView.this.isEditing || TabsView.this.editingStartAnimationProgress != 0.0f)) {
                    i8 = (int) (i8 + ((AndroidUtilities.dp(20.0f) - i8) * TabsView.this.editingStartAnimationProgress));
                }
                int i19 = i8;
                int i20 = this.currentTab.titleWidth;
                if (i19 != 0) {
                    i10 = AndroidUtilities.dp((str != null ? 1.0f : TabsView.this.editingStartAnimationProgress) * 6.0f) + i19;
                } else {
                    i10 = 0;
                }
                this.tabWidth = i20 + i10;
                int measuredWidth = (getMeasuredWidth() - this.tabWidth) / 2;
                CharSequence charSequence = this.currentTab.title;
                if ((charSequence == null && this.currentText != null) || !charSequence.equals(this.currentText)) {
                    Tab tab = this.currentTab;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(tab.title, TabsView.this.textPaint.getFontMetricsInt(), false);
                    tab.title = replaceEmoji;
                    this.currentText = replaceEmoji;
                    Text text = this.text;
                    if (text != null) {
                        text.detach();
                    }
                    this.text = new Text(this.currentText, TabsView.this.textPaint.getTextSize() / AndroidUtilities.density, TabsView.this.textPaint.getTypeface()).supportAnimatedEmojis(this);
                }
                Text text2 = this.text;
                if (text2 != null) {
                    i11 = i9;
                    str2 = str;
                    i12 = i17;
                    text2.ellipsize(AndroidUtilities.dp(400.0f)).draw(canvas, measuredWidth + this.textOffsetX, getMeasuredHeight() / 2, TabsView.this.textPaint.getColor(), 1.0f);
                } else {
                    i11 = i9;
                    str2 = str;
                    i12 = i17;
                }
                if (str2 != null || (this.currentTab.id != Integer.MAX_VALUE && (TabsView.this.isEditing || TabsView.this.editingStartAnimationProgress != 0.0f))) {
                    TabsView.this.textCounterPaint.setColor(Theme.getColor(TabsView.this.backgroundColorKey, TabsView.this.resourcesProvider));
                    if (!Theme.hasThemeKey(i16) || !Theme.hasThemeKey(i12)) {
                        TabsView.this.counterPaint.setColor(TabsView.this.textPaint.getColor());
                    } else {
                        int color = Theme.getColor(i16, TabsView.this.resourcesProvider);
                        if ((TabsView.this.animatingIndicator || TabsView.this.manualScrollingToPosition != -1) && ((i13 = this.currentTab.id) == i14 || i13 == i15)) {
                            TabsView.this.counterPaint.setColor(ColorUtils.blendARGB(Theme.getColor(i12, TabsView.this.resourcesProvider), color, TabsView.this.animatingIndicatorProgress));
                        } else {
                            TabsView.this.counterPaint.setColor(color);
                        }
                    }
                    int dp = measuredWidth + this.currentTab.titleWidth + AndroidUtilities.dp(6.0f);
                    int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2;
                    if (this.currentTab.id == Integer.MAX_VALUE || ((!TabsView.this.isEditing && TabsView.this.editingStartAnimationProgress == 0.0f) || str2 != null)) {
                        TabsView.this.counterPaint.setAlpha(NotificationCenter.cameraInitied);
                    } else {
                        TabsView.this.counterPaint.setAlpha((int) (TabsView.this.editingStartAnimationProgress * 255.0f));
                    }
                    this.rect.set(dp, measuredHeight, dp + i19, AndroidUtilities.dp(20.0f) + measuredHeight);
                    RectF rectF = this.rect;
                    float f3 = AndroidUtilities.density * 11.5f;
                    canvas.drawRoundRect(rectF, f3, f3, TabsView.this.counterPaint);
                    if (str2 != null) {
                        if (this.currentTab.id != Integer.MAX_VALUE) {
                            TabsView.this.textCounterPaint.setAlpha((int) ((1.0f - TabsView.this.editingStartAnimationProgress) * 255.0f));
                        }
                        RectF rectF2 = this.rect;
                        canvas.drawText(str2, rectF2.left + ((rectF2.width() - i11) / 2.0f), measuredHeight + AndroidUtilities.dp(14.5f), TabsView.this.textCounterPaint);
                    }
                    if (this.currentTab.id != Integer.MAX_VALUE && (TabsView.this.isEditing || TabsView.this.editingStartAnimationProgress != 0.0f)) {
                        TabsView.this.deletePaint.setColor(TabsView.this.textCounterPaint.getColor());
                        TabsView.this.deletePaint.setAlpha((int) (TabsView.this.editingStartAnimationProgress * 255.0f));
                        float dp2 = AndroidUtilities.dp(3.0f);
                        canvas.drawLine(this.rect.centerX() - dp2, this.rect.centerY() - dp2, this.rect.centerX() + dp2, this.rect.centerY() + dp2, TabsView.this.deletePaint);
                        canvas.drawLine(this.rect.centerX() - dp2, this.rect.centerY() + dp2, this.rect.centerX() + dp2, this.rect.centerY() - dp2, TabsView.this.deletePaint);
                    }
                }
                if (this.currentTab.id != Integer.MAX_VALUE && TabsView.this.editingAnimationProgress != 0.0f) {
                    canvas.restore();
                }
                canvas.restore();
            }

            @Override // android.view.View
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setSelected((this.currentTab == null || TabsView.this.selectedTabId == -1 || this.currentTab.id != TabsView.this.selectedTabId) ? false : true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TabsView(Context context, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            int i2 = 0;
            Object[] objArr = 0;
            this.indicatorProgress2 = 1.0f;
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            TextPaint textPaint2 = new TextPaint(1);
            this.textCounterPaint = textPaint2;
            TextPaint textPaint3 = new TextPaint(1);
            this.deletePaint = textPaint3;
            this.counterPaint = new Paint(1);
            this.tabs = new ArrayList();
            this.tabMarginDp = 16;
            this.selectedTabId = -1;
            this.manualScrollingToPosition = -1;
            this.manualScrollingToId = -1;
            this.scrollingToChild = -1;
            this.tabLineColorKey = Theme.key_profile_tabSelectedLine;
            this.activeTextColorKey = Theme.key_profile_tabSelectedText;
            this.unactiveTextColorKey = Theme.key_profile_tabText;
            this.selectorColorKey = Theme.key_profile_tabSelector;
            this.backgroundColorKey = Theme.key_actionBarDefault;
            this.interpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.positionToId = new SparseIntArray(5);
            this.idToPosition = new SparseIntArray(5);
            this.positionToWidth = new SparseIntArray(5);
            this.positionToX = new SparseIntArray(5);
            this.animationRunnable = new Runnable() { // from class: org.telegram.ui.Components.ViewPagerFixed.TabsView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (TabsView.this.animatingIndicator) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - TabsView.this.lastAnimationTime;
                        if (elapsedRealtime > 17) {
                            elapsedRealtime = 17;
                        }
                        TabsView.access$3116(TabsView.this, elapsedRealtime / 200.0f);
                        TabsView tabsView = TabsView.this;
                        tabsView.setAnimationIdicatorProgress(tabsView.interpolator.getInterpolation(TabsView.this.animationTime));
                        if (TabsView.this.animationTime > 1.0f) {
                            TabsView.this.animationTime = 1.0f;
                        }
                        if (TabsView.this.animationTime < 1.0f) {
                            AndroidUtilities.runOnUIThread(TabsView.this.animationRunnable);
                            return;
                        }
                        TabsView.this.animatingIndicator = false;
                        TabsView.this.setEnabled(true);
                        if (TabsView.this.delegate != null) {
                            TabsView.this.delegate.onPageScrolled(1.0f);
                        }
                    }
                }
            };
            this.selectorPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
            this.selectorType = i;
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(i == 9 ? 14.0f : 15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint3.setStyle(Paint.Style.STROKE);
            textPaint3.setStrokeCap(Paint.Cap.ROUND);
            textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
            this.selectorDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            this.selectorDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, 0.0f, 0.0f, 0.0f, 0.0f});
            this.selectorDrawable.setColor(Theme.getColor(this.tabLineColorKey, resourcesProvider));
            setHorizontalScrollBarEnabled(false);
            RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.Components.ViewPagerFixed.TabsView.2
                @Override // android.view.ViewGroup
                public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
                    super.addView(view, i3, layoutParams);
                    if (TabsView.this.isInHiddenMode) {
                        view.setScaleX(0.3f);
                        view.setScaleY(0.3f);
                        view.setAlpha(0.0f);
                    } else {
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setAlpha(1.0f);
                    }
                }

                @Override // android.view.View
                public void setAlpha(float f) {
                    super.setAlpha(f);
                    TabsView.this.invalidate();
                }

                @Override // org.telegram.ui.Components.RecyclerListView
                protected boolean canHighlightChildAt(View view, float f, float f2) {
                    if (TabsView.this.isEditing) {
                        TabView tabView = (TabView) view;
                        float dp = AndroidUtilities.dp(6.0f);
                        if (tabView.rect.left - dp < f && tabView.rect.right + dp > f) {
                            return false;
                        }
                    }
                    return super.canHighlightChildAt(view, f, f2);
                }
            };
            this.listView = recyclerListView;
            recyclerListView.setOverScrollMode(2);
            if (z) {
                this.listView.setItemAnimator(null);
            } else {
                ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
            }
            this.listView.setSelectorType(i);
            if (i == 3) {
                this.listView.setSelectorRadius(0);
            } else {
                this.listView.setSelectorRadius(6);
            }
            this.listView.setSelectorDrawableColor(Theme.getColor(this.selectorColorKey, resourcesProvider));
            RecyclerListView recyclerListView2 = this.listView;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i2, objArr == true ? 1 : 0) { // from class: org.telegram.ui.Components.ViewPagerFixed.TabsView.3
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i3) {
                    LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: org.telegram.ui.Components.ViewPagerFixed.TabsView.3.1
                        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                        protected void onTargetFound(View view, RecyclerView.State state2, RecyclerView.SmoothScroller.Action action) {
                            int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
                            if (calculateDxToMakeVisible > 0 || (calculateDxToMakeVisible == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
                                calculateDxToMakeVisible += AndroidUtilities.dp(60.0f);
                            } else if (calculateDxToMakeVisible < 0 || (calculateDxToMakeVisible == 0 && view.getRight() + AndroidUtilities.dp(21.0f) > TabsView.this.getMeasuredWidth())) {
                                calculateDxToMakeVisible -= AndroidUtilities.dp(60.0f);
                            }
                            int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
                            int max = Math.max(NotificationCenter.newEmojiSuggestionsAvailable, calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible))));
                            if (max > 0) {
                                action.update(-calculateDxToMakeVisible, -calculateDyToMakeVisible, max, this.mDecelerateInterpolator);
                            }
                        }
                    };
                    linearSmoothScroller.setTargetPosition(i3);
                    startSmoothScroll(linearSmoothScroller);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
                public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
                    if (TabsView.this.isInHiddenMode) {
                        accessibilityNodeInfoCompat.setVisibleToUser(false);
                    }
                }
            };
            this.layoutManager = linearLayoutManager;
            recyclerListView2.setLayoutManager(linearLayoutManager);
            this.listView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
            this.listView.setClipToPadding(false);
            this.listView.setDrawSelectorBehind(true);
            ListAdapter listAdapter = new ListAdapter(context);
            this.adapter = listAdapter;
            listAdapter.setHasStableIds(z);
            this.listView.setAdapter(this.adapter);
            this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.Components.ViewPagerFixed$TabsView$$ExternalSyntheticLambda3
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public /* synthetic */ boolean hasDoubleTap(View view, int i3) {
                    return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view, i3);
                }

                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public /* synthetic */ void onDoubleTap(View view, int i3, float f, float f2) {
                    RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view, i3, f, f2);
                }

                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public final void onItemClick(View view, int i3, float f, float f2) {
                    ViewPagerFixed.TabsView.this.lambda$new$0(view, i3, f, f2);
                }
            });
            this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.Components.ViewPagerFixed$TabsView$$ExternalSyntheticLambda4
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
                public final boolean onItemClick(View view, int i3) {
                    boolean lambda$new$1;
                    lambda$new$1 = ViewPagerFixed.TabsView.this.lambda$new$1(view, i3);
                    return lambda$new$1;
                }
            });
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Components.ViewPagerFixed.TabsView.4
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    TabsView.this.invalidate();
                }
            });
            if (i == 9) {
                addView(this.listView, LayoutHelper.createFrame(-2, -1, 1));
            } else {
                addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view, int i, float f, float f2) {
            TabsViewDelegate tabsViewDelegate;
            TabsViewDelegate tabsViewDelegate2 = this.delegate;
            if (tabsViewDelegate2 == null || tabsViewDelegate2.canPerformActions()) {
                TabView tabView = (TabView) view;
                if (i == this.currentPosition && (tabsViewDelegate = this.delegate) != null) {
                    tabsViewDelegate.onSamePageSelected();
                    return;
                }
                Utilities.Callback2Return callback2Return = this.preTabClick;
                if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(tabView.currentTab.id), Integer.valueOf(i))).booleanValue()) {
                    scrollToTab(tabView.currentTab.id, i);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$1(View view, int i) {
            Utilities.Callback2Return callback2Return = this.onTabLongClick;
            if (callback2Return == null) {
                return false;
            }
            return ((Boolean) callback2Return.run(Integer.valueOf(((TabView) view).currentTab.id), view)).booleanValue();
        }

        public void setDelegate(TabsViewDelegate tabsViewDelegate) {
            this.delegate = tabsViewDelegate;
        }

        public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
            this.preTabClick = callback2Return;
        }

        public boolean isAnimatingIndicator() {
            return this.animatingIndicator;
        }

        public int getCurrentPosition() {
            return this.currentPosition;
        }

        public int getPreviousPosition() {
            return this.previousPosition;
        }

        public float getAnimatingIndicatorProgress() {
            return this.animatingIndicatorProgress;
        }

        public void scrollToTab(int i, int i2) {
            int i3 = this.currentPosition;
            boolean z = i3 < i2;
            this.scrollingToChild = -1;
            this.previousPosition = i3;
            this.previousId = this.selectedTabId;
            TabsViewDelegate tabsViewDelegate = this.delegate;
            if (tabsViewDelegate == null || tabsViewDelegate.needsTab(i2)) {
                this.currentPosition = i2;
                this.selectedTabId = i;
            }
            ValueAnimator valueAnimator = this.tabsAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.animatingIndicator) {
                this.animatingIndicator = false;
            }
            this.animationTime = 0.0f;
            this.animatingIndicatorProgress = 0.0f;
            this.animatingIndicator = true;
            setEnabled(false);
            TabsViewDelegate tabsViewDelegate2 = this.delegate;
            if (tabsViewDelegate2 != null) {
                tabsViewDelegate2.onPageSelected(i2, z);
            }
            scrollToChild(this.currentPosition);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.tabsAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ViewPagerFixed$TabsView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ViewPagerFixed.TabsView.this.lambda$scrollToTab$2(valueAnimator2);
                }
            });
            this.tabsAnimator.setDuration(250L);
            this.tabsAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.tabsAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ViewPagerFixed.TabsView.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TabsView.this.animatingIndicator = false;
                    TabsView.this.setEnabled(true);
                    if (TabsView.this.delegate != null) {
                        TabsView.this.delegate.onPageScrolled(1.0f);
                    }
                    TabsView.this.invalidate();
                }
            });
            this.tabsAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scrollToTab$2(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            setAnimationIdicatorProgress(floatValue);
            TabsViewDelegate tabsViewDelegate = this.delegate;
            if (tabsViewDelegate != null) {
                tabsViewDelegate.onPageScrolled(floatValue);
            }
        }

        public void setAnimationIdicatorProgress(float f) {
            this.animatingIndicatorProgress = f;
            this.listView.invalidateViews();
            invalidate();
            TabsViewDelegate tabsViewDelegate = this.delegate;
            if (tabsViewDelegate != null) {
                tabsViewDelegate.onPageScrolled(f);
            }
        }

        public Drawable getSelectorDrawable() {
            return this.selectorDrawable;
        }

        public RecyclerListView getTabsContainer() {
            return this.listView;
        }

        public int getNextPageId(boolean z) {
            return this.positionToId.get(this.currentPosition + (z ? 1 : -1), -1);
        }

        public int getPageIdByPosition(int i) {
            return this.positionToId.get(i, -1);
        }

        public void addTab(int i, CharSequence charSequence) {
            int size = this.tabs.size();
            if (size == 0 && this.selectedTabId == -1) {
                this.selectedTabId = i;
            }
            this.positionToId.put(size, i);
            this.idToPosition.put(i, size);
            int i2 = this.selectedTabId;
            if (i2 != -1 && i2 == i) {
                this.currentPosition = size;
            }
            Tab tab = new Tab(i, charSequence);
            this.allTabsWidth += tab.getWidth(true, this.textPaint) + AndroidUtilities.dp(this.tabMarginDp * 2);
            this.tabs.add(tab);
        }

        public void removeTabs() {
            this.tabs.clear();
            this.positionToId.clear();
            this.idToPosition.clear();
            this.positionToWidth.clear();
            this.positionToX.clear();
            this.allTabsWidth = 0;
        }

        public void setReordering(final boolean z) {
            if (this.reordering == z) {
                return;
            }
            this.reordering = z;
            if (z && this.itemTouchHelper == null) {
                this.itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() { // from class: org.telegram.ui.Components.ViewPagerFixed.TabsView.6
                    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
                    }

                    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                        if (TabsView.this.delegate.canReorder(viewHolder.getAdapterPosition())) {
                            return ItemTouchHelper.Callback.makeMovementFlags(12, 0);
                        }
                        return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                    }

                    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                        int adapterPosition = viewHolder.getAdapterPosition();
                        int adapterPosition2 = viewHolder2.getAdapterPosition();
                        if (!TabsView.this.delegate.canReorder(adapterPosition) || !TabsView.this.delegate.canReorder(adapterPosition2)) {
                            return false;
                        }
                        Utilities.swapItems(TabsView.this.tabs, adapterPosition, adapterPosition2);
                        TabsView.this.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = TabsView.this.tabs.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((Tab) it.next()).id));
                        }
                        TabsView.this.delegate.applyReorder(arrayList);
                        return true;
                    }

                    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z2) {
                        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z2);
                        TabsView.this.invalidate();
                    }
                });
            }
            if (this.reordering && this.itemAnimator == null) {
                DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() { // from class: org.telegram.ui.Components.ViewPagerFixed.TabsView.7
                    @Override // androidx.recyclerview.widget.DefaultItemAnimator
                    protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                        super.onMoveAnimationUpdate(viewHolder);
                        TabsView.this.invalidate();
                    }
                };
                this.itemAnimator = defaultItemAnimator;
                defaultItemAnimator.setSupportsChangeAnimations(false);
                this.itemAnimator.setDelayAnimations(false);
                this.itemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.itemAnimator.setDurations(350L);
            }
            ItemTouchHelper itemTouchHelper = this.itemTouchHelper;
            if (itemTouchHelper != null) {
                itemTouchHelper.attachToRecyclerView(z ? this.listView : null);
            }
            this.listView.setItemAnimator(z ? this.itemAnimator : null);
            AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() { // from class: org.telegram.ui.Components.ViewPagerFixed$TabsView$$ExternalSyntheticLambda2
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    ViewPagerFixed.TabsView.this.lambda$setReordering$3(z, (View) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setReordering$3(boolean z, View view) {
            TabsViewDelegate tabsViewDelegate;
            int childAdapterPosition = this.listView.getChildAdapterPosition(view);
            if (view instanceof TabView) {
                ((TabView) view).setReordering(z && (tabsViewDelegate = this.delegate) != null && tabsViewDelegate.canReorder(childAdapterPosition));
            }
        }

        public void finishAddingTabs() {
            this.adapter.notifyDataSetChanged();
        }

        public int getCurrentTabId() {
            return this.selectedTabId;
        }

        public int getFirstTabId() {
            return this.positionToId.get(0, 0);
        }

        private void updateTabsWidths() {
            this.positionToX.clear();
            this.positionToWidth.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size = this.tabs.size();
            for (int i = 0; i < size; i++) {
                int width = ((Tab) this.tabs.get(i)).getWidth(false, this.textPaint);
                this.positionToWidth.put(i, width);
                this.positionToX.put(i, (this.additionalTabWidth / 2) + dp);
                dp += width + AndroidUtilities.dp(this.tabMarginDp * 2) + this.additionalTabWidth;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void saveFromValues() {
            this.overrideFromX = this.lastDrawnIndicatorX;
            this.overrideFromW = this.lastDrawnIndicatorW;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
        @Override // android.view.ViewGroup
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int findFirstVisibleItemPosition;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition;
            int i;
            int i2;
            int left;
            int i3;
            boolean drawChild = super.drawChild(canvas, view, j);
            if (view == this.listView) {
                int measuredHeight = getMeasuredHeight();
                boolean z = this.isInHiddenMode;
                if (z) {
                    float f = this.hideProgress;
                    if (f != 1.0f) {
                        float f2 = f + 0.1f;
                        this.hideProgress = f2;
                        if (f2 > 1.0f) {
                            this.hideProgress = 1.0f;
                        }
                        invalidate();
                        this.selectorDrawable.setAlpha((int) (this.listView.getAlpha() * 255.0f));
                        if (!this.animatingIndicator || this.manualScrollingToPosition != -1) {
                            findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
                            if (findFirstVisibleItemPosition != -1 && (findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) != null) {
                                if (!this.animatingIndicator) {
                                    i = this.previousPosition;
                                    i2 = this.currentPosition;
                                } else {
                                    i = this.currentPosition;
                                    i2 = this.manualScrollingToPosition;
                                }
                                int i4 = this.positionToX.get(i);
                                int i5 = this.positionToX.get(i2);
                                int i6 = this.positionToWidth.get(i);
                                int i7 = this.positionToWidth.get(i2);
                                if (this.additionalTabWidth == 0) {
                                    left = ((int) (i4 + ((i5 - i4) * this.animatingIndicatorProgress))) + AndroidUtilities.dp(this.tabMarginDp);
                                } else {
                                    left = (((int) (i4 + ((i5 - i4) * this.animatingIndicatorProgress))) - (this.positionToX.get(findFirstVisibleItemPosition) - findViewHolderForAdapterPosition.itemView.getLeft())) + AndroidUtilities.dp(this.tabMarginDp);
                                }
                                i3 = (int) (i6 + ((i7 - i6) * this.animatingIndicatorProgress));
                                int x = (int) (left + this.listView.getX());
                                if (i3 != 0) {
                                    if (this.selectorType == 9) {
                                        this.selectorPaint.setColor(Theme.multAlpha(this.textPaint.getColor(), 0.15f));
                                        float f3 = measuredHeight / 2.0f;
                                        float dp = AndroidUtilities.dp(26.0f);
                                        RectF rectF = AndroidUtilities.rectTmp;
                                        float f4 = dp / 2.0f;
                                        rectF.set(x - AndroidUtilities.dp(12.0f), f3 - f4, x + i3 + AndroidUtilities.dp(12.0f), f3 + f4);
                                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.selectorPaint);
                                    } else {
                                        float f5 = x;
                                        this.lastDrawnIndicatorX = f5;
                                        float f6 = i3;
                                        this.lastDrawnIndicatorW = f6;
                                        float f7 = this.indicatorProgress2;
                                        if (f7 != 1.0f) {
                                            x = (int) AndroidUtilities.lerp(f5, f5, f7);
                                            i3 = (int) AndroidUtilities.lerp(this.lastDrawnIndicatorW, f6, this.indicatorProgress2);
                                        }
                                        this.selectorDrawable.setBounds(x, (int) ((measuredHeight - AndroidUtilities.dpr(4.0f)) + (this.hideProgress * AndroidUtilities.dpr(4.0f))), i3 + x, (int) (measuredHeight + (this.hideProgress * AndroidUtilities.dpr(4.0f))));
                                        this.selectorDrawable.draw(canvas);
                                    }
                                }
                            }
                            i3 = 0;
                            left = 0;
                            int x2 = (int) (left + this.listView.getX());
                            if (i3 != 0) {
                            }
                        } else {
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.currentPosition);
                            if (findViewHolderForAdapterPosition2 != null) {
                                TabView tabView = (TabView) findViewHolderForAdapterPosition2.itemView;
                                i3 = tabView.tabWidth;
                                left = (int) (tabView.getX() + ((tabView.getMeasuredWidth() - i3) / 2));
                                int x22 = (int) (left + this.listView.getX());
                                if (i3 != 0) {
                                }
                            }
                            i3 = 0;
                            left = 0;
                            int x222 = (int) (left + this.listView.getX());
                            if (i3 != 0) {
                            }
                        }
                    }
                }
                if (!z) {
                    float f8 = this.hideProgress;
                    if (f8 != 0.0f) {
                        float f9 = f8 - 0.12f;
                        this.hideProgress = f9;
                        if (f9 < 0.0f) {
                            this.hideProgress = 0.0f;
                        }
                        invalidate();
                    }
                }
                this.selectorDrawable.setAlpha((int) (this.listView.getAlpha() * 255.0f));
                if (!this.animatingIndicator) {
                }
                findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
                if (findFirstVisibleItemPosition != -1) {
                    if (!this.animatingIndicator) {
                    }
                    int i42 = this.positionToX.get(i);
                    int i52 = this.positionToX.get(i2);
                    int i62 = this.positionToWidth.get(i);
                    int i72 = this.positionToWidth.get(i2);
                    if (this.additionalTabWidth == 0) {
                    }
                    i3 = (int) (i62 + ((i72 - i62) * this.animatingIndicatorProgress));
                    int x2222 = (int) (left + this.listView.getX());
                    if (i3 != 0) {
                    }
                }
                i3 = 0;
                left = 0;
                int x22222 = (int) (left + this.listView.getX());
                if (i3 != 0) {
                }
            }
            return drawChild;
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            if (!this.tabs.isEmpty()) {
                int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(7.0f)) - AndroidUtilities.dp(7.0f);
                int i3 = this.additionalTabWidth;
                if (this.tabs.size() == 1 || this.selectorType == 9) {
                    this.additionalTabWidth = 0;
                } else {
                    int i4 = this.allTabsWidth;
                    this.additionalTabWidth = i4 < size ? (size - i4) / this.tabs.size() : 0;
                }
                if (i3 != this.additionalTabWidth) {
                    this.ignoreLayout = true;
                    this.adapter.notifyDataSetChanged();
                    this.ignoreLayout = false;
                }
                updateTabsWidths();
                this.invalidated = false;
            }
            super.onMeasure(i, i2);
        }

        public void updateColors() {
            this.selectorDrawable.setColor(Theme.getColor(this.tabLineColorKey, this.resourcesProvider));
            this.listView.invalidateViews();
            this.listView.invalidate();
            invalidate();
        }

        @Override // android.view.View, android.view.ViewParent
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        private void scrollToChild(int i) {
            if (this.tabs.isEmpty() || this.scrollingToChild == i || i < 0 || i >= this.tabs.size()) {
                return;
            }
            this.scrollingToChild = i;
            this.listView.smoothScrollToPosition(i);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int i5 = i3 - i;
            if (this.prevLayoutWidth != i5) {
                this.prevLayoutWidth = i5;
                this.scrollingToChild = -1;
                if (this.animatingIndicator) {
                    AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
                    this.animatingIndicator = false;
                    setEnabled(true);
                    TabsViewDelegate tabsViewDelegate = this.delegate;
                    if (tabsViewDelegate != null) {
                        tabsViewDelegate.onPageScrolled(1.0f);
                    }
                }
            }
        }

        public void selectTab(int i, int i2, float f) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.currentPosition = i;
            this.selectedTabId = this.positionToId.get(i);
            if (f > 0.0f) {
                TabsViewDelegate tabsViewDelegate = this.delegate;
                if (tabsViewDelegate == null || tabsViewDelegate.needsTab(i2)) {
                    this.manualScrollingToPosition = i2;
                } else {
                    this.manualScrollingToPosition = i;
                }
                this.manualScrollingToId = this.positionToId.get(i2);
            } else {
                this.manualScrollingToPosition = -1;
                this.manualScrollingToId = -1;
            }
            this.animatingIndicatorProgress = f;
            this.listView.invalidateViews();
            invalidate();
            scrollToChild(i);
            if (f >= 1.0f) {
                this.manualScrollingToPosition = -1;
                this.manualScrollingToId = -1;
                this.currentPosition = i2;
                this.selectedTabId = this.positionToId.get(i2);
            }
            TabsViewDelegate tabsViewDelegate2 = this.delegate;
            if (tabsViewDelegate2 != null) {
                tabsViewDelegate2.invalidateBlur();
            }
        }

        public void selectTabWithId(int i, float f) {
            int i2 = this.idToPosition.get(i, -1);
            if (i2 < 0) {
                return;
            }
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f > 0.0f) {
                this.manualScrollingToPosition = i2;
                this.manualScrollingToId = i;
            } else {
                this.manualScrollingToPosition = -1;
                this.manualScrollingToId = -1;
            }
            this.animatingIndicatorProgress = f;
            this.listView.invalidateViews();
            invalidate();
            scrollToChild(i2);
            if (f >= 1.0f) {
                this.manualScrollingToPosition = -1;
                this.manualScrollingToId = -1;
                this.currentPosition = i2;
                this.selectedTabId = i;
            }
        }

        public void setIsEditing(boolean z) {
            this.isEditing = z;
            this.editingForwardAnimation = true;
            this.listView.invalidateViews();
            invalidate();
            if (this.isEditing || !this.orderChanged) {
                return;
            }
            MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> arrayList = MessagesController.getInstance(UserConfig.selectedAccount).dialogFilters;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i);
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(arrayList.get(i).id));
            }
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new RequestDelegate() { // from class: org.telegram.ui.Components.ViewPagerFixed$TabsView$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ViewPagerFixed.TabsView.lambda$setIsEditing$4(tLObject, tL_error);
                }
            });
            this.orderChanged = false;
        }

        private class ListAdapter extends RecyclerListView.SelectionAdapter {
            private Context mContext;

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemViewType(int i) {
                return 0;
            }

            @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            public ListAdapter(Context context) {
                this.mContext = context;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return TabsView.this.tabs.size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public long getItemId(int i) {
                return ((Tab) TabsView.this.tabs.get(i)).id;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new RecyclerListView.Holder(TabsView.this.new TabView(this.mContext));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                TabView tabView = (TabView) viewHolder.itemView;
                tabView.setTab((Tab) TabsView.this.tabs.get(i), i);
                tabView.setReordering(TabsView.this.reordering && TabsView.this.delegate != null && TabsView.this.delegate.canReorder(i));
            }
        }

        public void hide(boolean z, boolean z2) {
            this.isInHiddenMode = z;
            int i = 0;
            if (z2) {
                while (i < this.listView.getChildCount()) {
                    this.listView.getChildAt(i).animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.0f : 1.0f).scaleY(z ? 0.0f : 1.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(220L).start();
                    i++;
                }
            } else {
                while (i < this.listView.getChildCount()) {
                    View childAt = this.listView.getChildAt(i);
                    childAt.setScaleX(z ? 0.0f : 1.0f);
                    childAt.setScaleY(z ? 0.0f : 1.0f);
                    childAt.setAlpha(z ? 0.0f : 1.0f);
                    i++;
                }
                this.hideProgress = z ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    private View findScrollingChild(ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(this.rect);
                if (!this.rect.contains((int) f, (int) f2)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if (childAt instanceof ViewGroup) {
                        android.graphics.Rect rect = this.rect;
                        View findScrollingChild = findScrollingChild((ViewGroup) childAt, f - rect.left, f2 - rect.top);
                        if (findScrollingChild != null) {
                            return findScrollingChild;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public void drawForBlur(Canvas canvas) {
        RecyclerListView findRecyclerView;
        int i = 0;
        while (true) {
            View[] viewArr = this.viewPages;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0 && (findRecyclerView = findRecyclerView(this.viewPages[i])) != null) {
                for (int i2 = 0; i2 < findRecyclerView.getChildCount(); i2++) {
                    View childAt = findRecyclerView.getChildAt(i2);
                    if (childAt.getY() < AndroidUtilities.dp(203.0f) + AndroidUtilities.dp(100.0f)) {
                        int save = canvas.save();
                        canvas.translate(this.viewPages[i].getX(), getY() + this.viewPages[i].getY() + findRecyclerView.getY() + childAt.getY());
                        childAt.draw(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            }
            i++;
        }
    }

    private RecyclerListView findRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerListView) {
                return (RecyclerListView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                findRecyclerView(childAt);
            }
        }
        return null;
    }

    public void setAllowDisallowInterceptTouch(boolean z) {
        this.allowDisallowInterceptTouch = z;
    }
}
