package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
/* loaded from: classes3.dex */
public class BottomSheet extends Dialog {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    private boolean allowCustomAnimation;
    private boolean allowDrawContent;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    protected ColorDrawable backDrawable;
    protected int backgroundPaddingLeft;
    protected int backgroundPaddingTop;
    protected int behindKeyboardColor;
    protected String behindKeyboardColorKey;
    private boolean bigTitle;
    private int bottomInset;
    protected boolean calcMandatoryInsets;
    private boolean canDismissWithSwipe;
    protected ContainerView container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected BottomSheetDelegateInterface delegate;
    protected boolean dimBehind;
    protected int dimBehindAlpha;
    private boolean disableScroll;
    private Runnable dismissRunnable;
    private boolean dismissed;
    public boolean drawDoubleNavigationBar;
    public boolean drawNavigationBar;
    private boolean focusable;
    private boolean fullHeight;
    protected boolean fullWidth;
    private float hideSystemVerticalInsetsProgress;
    protected boolean isFullscreen;
    protected boolean isPortrait;
    private int[] itemIcons;
    private ArrayList<BottomSheetCell> itemViews;
    private CharSequence[] items;
    private ValueAnimator keyboardContentAnimator;
    protected boolean keyboardVisible;
    private WindowInsets lastInsets;
    private int layoutCount;
    private int leftInset;
    private boolean multipleLinesTitle;
    protected int navBarColor;
    protected String navBarColorKey;
    protected float navigationBarAlpha;
    protected ValueAnimator navigationBarAnimation;
    protected View nestedScrollChild;
    private DialogInterface.OnClickListener onClickListener;
    private DialogInterface.OnDismissListener onHideListener;
    protected Interpolator openInterpolator;
    private boolean openNoDelay;
    private int overlayDrawNavBarColor;
    protected Theme.ResourcesProvider resourcesProvider;
    private int rightInset;
    public boolean scrollNavBar;
    protected Drawable shadowDrawable;
    private boolean showWithoutAnimation;
    protected boolean smoothKeyboardAnimationEnabled;
    protected Runnable startAnimationRunnable;
    private int statusBarHeight;
    private int tag;
    private CharSequence title;
    private TextView titleView;
    private int touchSlop;
    public boolean useBackgroundTopPadding;
    private boolean useFastDismiss;
    protected boolean useHardwareLayer;
    protected boolean useLightNavBar;
    protected boolean useLightStatusBar;
    protected boolean useSmoothKeyboard;

    /* loaded from: classes3.dex */
    public static class BottomSheetDelegate implements BottomSheetDelegateInterface {
        @Override // org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegateInterface
        public boolean canDismiss() {
            return true;
        }

        @Override // org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegateInterface
        public void onOpenAnimationEnd() {
        }
    }

    /* loaded from: classes3.dex */
    public interface BottomSheetDelegateInterface {
        boolean canDismiss();

        void onOpenAnimationEnd();
    }

    public static /* synthetic */ boolean lambda$onCreate$2(View view, MotionEvent motionEvent) {
        return true;
    }

    protected boolean canDismissWithTouchOutside() {
        return true;
    }

    protected int getTargetOpenTranslationY() {
        return 0;
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return null;
    }

    public void mainContainerDispatchDraw(Canvas canvas) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onContainerDraw(Canvas canvas) {
    }

    protected boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    protected void onContainerTranslationYChanged(float f) {
    }

    protected boolean onCustomCloseAnimation() {
        return false;
    }

    protected boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        return false;
    }

    protected boolean onCustomMeasure(View view, int i, int i2) {
        return false;
    }

    public boolean onCustomOpenAnimation() {
        return false;
    }

    public void onDismissAnimationStart() {
    }

    protected boolean onScrollUp(float f) {
        return false;
    }

    protected void onScrollUpBegin(float f) {
    }

    protected void onScrollUpEnd(float f) {
    }

    protected boolean shouldOverlayCameraViewOverNavBar() {
        return false;
    }

    static /* synthetic */ int access$1210(BottomSheet bottomSheet) {
        int i = bottomSheet.layoutCount;
        bottomSheet.layoutCount = i - 1;
        return i;
    }

    static /* synthetic */ int access$712(BottomSheet bottomSheet, int i) {
        int i2 = bottomSheet.bottomInset + i;
        bottomSheet.bottomInset = i2;
        return i2;
    }

    static /* synthetic */ int access$720(BottomSheet bottomSheet, int i) {
        int i2 = bottomSheet.bottomInset - i;
        bottomSheet.bottomInset = i2;
        return i2;
    }

    public void setDisableScroll(boolean z) {
        this.disableScroll = z;
    }

    /* loaded from: classes3.dex */
    public class ContainerView extends FrameLayout implements NestedScrollingParent {
        private boolean keyboardChanged;
        private int keyboardHeight;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker velocityTracker = null;
        private int startedTrackingPointerId = -1;
        private boolean maybeStartTracking = false;
        private boolean startedTracking = false;
        private AnimatorSet currentAnimation = null;
        private Rect rect = new Rect();
        private Paint backgroundPaint = new Paint();
        private float y = 0.0f;
        private NestedScrollingParentHelper nestedScrollingParentHelper = new NestedScrollingParentHelper(this);

        @Override // android.view.View
        public boolean hasOverlappingRendering() {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onNestedFling(View view, float f, float f2, boolean z) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onNestedPreFling(View view, float f, float f2) {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContainerView(Context context) {
            super(context);
            BottomSheet.this = r1;
            setWillNotDraw(false);
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onStartNestedScroll(View view, View view2, int i) {
            BottomSheet bottomSheet = BottomSheet.this;
            View view3 = bottomSheet.nestedScrollChild;
            if ((view3 == null || view == view3) && !bottomSheet.dismissed) {
                BottomSheet bottomSheet2 = BottomSheet.this;
                if (bottomSheet2.allowNestedScroll && i == 2 && !bottomSheet2.canDismissWithSwipe()) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public void onNestedScrollAccepted(View view, View view2, int i) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
            if (BottomSheet.this.dismissed || !BottomSheet.this.allowNestedScroll) {
                return;
            }
            cancelCurrentAnimation();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public void onStopNestedScroll(View view) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
            if (!BottomSheet.this.dismissed) {
                BottomSheet bottomSheet = BottomSheet.this;
                if (!bottomSheet.allowNestedScroll) {
                    return;
                }
                bottomSheet.containerView.getTranslationY();
                checkDismiss(0.0f, 0.0f);
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
            if (BottomSheet.this.dismissed || !BottomSheet.this.allowNestedScroll) {
                return;
            }
            cancelCurrentAnimation();
            if (i4 == 0) {
                return;
            }
            float translationY = BottomSheet.this.containerView.getTranslationY() - i4;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            BottomSheet.this.containerView.setTranslationY(translationY);
            BottomSheet.this.container.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
            if (BottomSheet.this.dismissed || !BottomSheet.this.allowNestedScroll) {
                return;
            }
            cancelCurrentAnimation();
            float translationY = BottomSheet.this.containerView.getTranslationY();
            float f = 0.0f;
            if (translationY <= 0.0f || i2 <= 0) {
                return;
            }
            float f2 = translationY - i2;
            iArr[1] = i2;
            if (f2 >= 0.0f) {
                f = f2;
            }
            BottomSheet.this.containerView.setTranslationY(f);
            BottomSheet.this.container.invalidate();
        }

        @Override // android.view.ViewGroup
        public int getNestedScrollAxes() {
            return this.nestedScrollingParentHelper.getNestedScrollAxes();
        }

        private void checkDismiss(float f, float f2) {
            float translationY = BottomSheet.this.containerView.getTranslationY();
            if (!((translationY < AndroidUtilities.getPixelsInCM(0.8f, false) && (f2 < 3500.0f || Math.abs(f2) < Math.abs(f))) || (f2 < 0.0f && Math.abs(f2) >= 3500.0f))) {
                boolean z = BottomSheet.this.allowCustomAnimation;
                BottomSheet.this.allowCustomAnimation = false;
                BottomSheet.this.useFastDismiss = true;
                BottomSheet.this.dismiss();
                BottomSheet.this.allowCustomAnimation = z;
                return;
            }
            this.currentAnimation = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.BottomSheet$ContainerView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomSheet.ContainerView.this.lambda$checkDismiss$0(valueAnimator);
                }
            });
            this.currentAnimation.playTogether(ObjectAnimator.ofFloat(BottomSheet.this.containerView, "translationY", 0.0f), ofFloat);
            this.currentAnimation.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.BottomSheet.ContainerView.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (ContainerView.this.currentAnimation != null && ContainerView.this.currentAnimation.equals(animator)) {
                        ContainerView.this.currentAnimation = null;
                    }
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
                }
            });
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
            this.currentAnimation.start();
        }

        public /* synthetic */ void lambda$checkDismiss$0(ValueAnimator valueAnimator) {
            ContainerView containerView = BottomSheet.this.container;
            if (containerView != null) {
                containerView.invalidate();
            }
        }

        private void cancelCurrentAnimation() {
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
        }

        public boolean processTouchEvent(MotionEvent motionEvent, boolean z) {
            if (BottomSheet.this.dismissed) {
                return false;
            }
            if (BottomSheet.this.onContainerTouchEvent(motionEvent)) {
                return true;
            }
            if (BottomSheet.this.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.startedTracking && !this.maybeStartTracking && motionEvent.getPointerCount() == 1)) {
                this.startedTrackingX = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.startedTrackingY = y;
                if (y < BottomSheet.this.containerView.getTop() || this.startedTrackingX < BottomSheet.this.containerView.getLeft() || this.startedTrackingX > BottomSheet.this.containerView.getRight()) {
                    BottomSheet.this.onDismissWithTouchOutside();
                    return true;
                }
                BottomSheet.this.onScrollUpBegin(this.y);
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.maybeStartTracking = true;
                cancelCurrentAnimation();
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                float abs = Math.abs((int) (motionEvent.getX() - this.startedTrackingX));
                float y2 = ((int) motionEvent.getY()) - this.startedTrackingY;
                boolean onScrollUp = BottomSheet.this.onScrollUp(this.y + y2);
                this.velocityTracker.addMovement(motionEvent);
                if (!BottomSheet.this.disableScroll && this.maybeStartTracking && !this.startedTracking && y2 > 0.0f && y2 / 3.0f > Math.abs(abs) && Math.abs(y2) >= BottomSheet.this.touchSlop) {
                    this.startedTrackingY = (int) motionEvent.getY();
                    this.maybeStartTracking = false;
                    this.startedTracking = true;
                    requestDisallowInterceptTouchEvent(true);
                } else if (this.startedTracking) {
                    float f = this.y + y2;
                    this.y = f;
                    if (!onScrollUp) {
                        this.y = Math.max(f, 0.0f);
                    }
                    BottomSheet.this.containerView.setTranslationY(Math.max(this.y, 0.0f));
                    this.startedTrackingY = (int) motionEvent.getY();
                    BottomSheet.this.container.invalidate();
                }
            } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.computeCurrentVelocity(1000);
                BottomSheet.this.onScrollUpEnd(this.y);
                if (this.startedTracking || this.y > 0.0f) {
                    checkDismiss(this.velocityTracker.getXVelocity(), this.velocityTracker.getYVelocity());
                } else {
                    this.maybeStartTracking = false;
                }
                this.startedTracking = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.velocityTracker = null;
                }
                this.startedTrackingPointerId = -1;
            }
            return (!z && this.maybeStartTracking) || this.startedTracking || !BottomSheet.this.canDismissWithSwipe();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return processTouchEvent(motionEvent, false);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
        @Override // android.widget.FrameLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int i3;
            ViewGroup viewGroup;
            int childCount;
            int i4;
            int i5;
            int i6;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            View rootView = getRootView();
            getWindowVisibleDisplayFrame(this.rect);
            int i7 = this.keyboardHeight;
            Rect rect = this.rect;
            if (rect.bottom != 0 && rect.top != 0) {
                int height = (int) ((rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress) : 0.0f)) - (AndroidUtilities.getViewInset(rootView) * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress)));
                Rect rect2 = this.rect;
                int max = Math.max(0, height - (rect2.bottom - rect2.top));
                this.keyboardHeight = max;
                if (max < AndroidUtilities.dp(20.0f)) {
                    this.keyboardHeight = 0;
                }
                BottomSheet.access$720(BottomSheet.this, this.keyboardHeight);
            } else {
                this.keyboardHeight = 0;
            }
            int i8 = this.keyboardHeight;
            boolean z = true;
            if (i7 != i8) {
                this.keyboardChanged = true;
            }
            BottomSheet.this.keyboardVisible = i8 > AndroidUtilities.dp(20.0f);
            if (BottomSheet.this.lastInsets != null && (i6 = Build.VERSION.SDK_INT) >= 21) {
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.bottomInset = bottomSheet.lastInsets.getSystemWindowInsetBottom();
                BottomSheet bottomSheet2 = BottomSheet.this;
                bottomSheet2.leftInset = bottomSheet2.lastInsets.getSystemWindowInsetLeft();
                BottomSheet bottomSheet3 = BottomSheet.this;
                bottomSheet3.rightInset = bottomSheet3.lastInsets.getSystemWindowInsetRight();
                if (i6 >= 29) {
                    BottomSheet bottomSheet4 = BottomSheet.this;
                    BottomSheet.access$712(bottomSheet4, bottomSheet4.getAdditionalMandatoryOffsets());
                }
                BottomSheet bottomSheet5 = BottomSheet.this;
                if (bottomSheet5.keyboardVisible) {
                    Rect rect3 = this.rect;
                    if (rect3.bottom != 0 && rect3.top != 0) {
                        BottomSheet.access$720(bottomSheet5, this.keyboardHeight);
                    }
                }
                BottomSheet bottomSheet6 = BottomSheet.this;
                if (!bottomSheet6.drawNavigationBar) {
                    i3 = size2 - bottomSheet6.getBottomInset();
                    setMeasuredDimension(size, i3);
                    if (BottomSheet.this.lastInsets != null && (i5 = Build.VERSION.SDK_INT) >= 21) {
                        int systemWindowInsetBottom = (int) (BottomSheet.this.lastInsets.getSystemWindowInsetBottom() * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress));
                        if (i5 >= 29) {
                            systemWindowInsetBottom += BottomSheet.this.getAdditionalMandatoryOffsets();
                        }
                        size2 -= systemWindowInsetBottom;
                    }
                    if (BottomSheet.this.lastInsets != null && Build.VERSION.SDK_INT >= 21) {
                        size -= BottomSheet.this.getRightInset() + BottomSheet.this.getLeftInset();
                    }
                    BottomSheet bottomSheet7 = BottomSheet.this;
                    if (size >= size2) {
                        z = false;
                    }
                    bottomSheet7.isPortrait = z;
                    viewGroup = bottomSheet7.containerView;
                    if (viewGroup != null) {
                        if (!bottomSheet7.fullWidth) {
                            if (AndroidUtilities.isTablet()) {
                                Point point = AndroidUtilities.displaySize;
                                i4 = View.MeasureSpec.makeMeasureSpec(((int) (Math.min(point.x, point.y) * 0.8f)) + (BottomSheet.this.backgroundPaddingLeft * 2), 1073741824);
                            } else {
                                BottomSheet bottomSheet8 = BottomSheet.this;
                                i4 = View.MeasureSpec.makeMeasureSpec(bottomSheet8.getBottomSheetWidth(bottomSheet8.isPortrait, size, size2) + (BottomSheet.this.backgroundPaddingLeft * 2), 1073741824);
                            }
                            BottomSheet.this.containerView.measure(i4, View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        } else {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec((bottomSheet7.backgroundPaddingLeft * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    childCount = getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = getChildAt(i9);
                        if (childAt.getVisibility() != 8) {
                            BottomSheet bottomSheet9 = BottomSheet.this;
                            if (childAt != bottomSheet9.containerView && !bottomSheet9.onCustomMeasure(childAt, size, size2)) {
                                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
                            }
                        }
                    }
                }
            }
            i3 = size2;
            setMeasuredDimension(size, i3);
            if (BottomSheet.this.lastInsets != null) {
                int systemWindowInsetBottom2 = (int) (BottomSheet.this.lastInsets.getSystemWindowInsetBottom() * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress));
                if (i5 >= 29) {
                }
                size2 -= systemWindowInsetBottom2;
            }
            if (BottomSheet.this.lastInsets != null) {
                size -= BottomSheet.this.getRightInset() + BottomSheet.this.getLeftInset();
            }
            BottomSheet bottomSheet72 = BottomSheet.this;
            if (size >= size2) {
            }
            bottomSheet72.isPortrait = z;
            viewGroup = bottomSheet72.containerView;
            if (viewGroup != null) {
            }
            childCount = getChildCount();
            while (i9 < childCount) {
            }
        }

        @Override // android.view.View, android.view.ViewParent
        public void requestLayout() {
            super.requestLayout();
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            Runnable runnable;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            ViewGroup viewGroup;
            int i15;
            BottomSheet bottomSheet;
            BottomSheet bottomSheet2;
            BottomSheet.access$1210(BottomSheet.this);
            ViewGroup viewGroup2 = BottomSheet.this.containerView;
            if (viewGroup2 != null) {
                int measuredHeight = (i4 - i2) - viewGroup2.getMeasuredHeight();
                if (BottomSheet.this.lastInsets == null || (i15 = Build.VERSION.SDK_INT) < 21) {
                    i14 = i;
                    i13 = i3;
                } else {
                    i14 = i + BottomSheet.this.getLeftInset();
                    i13 = i3 - BottomSheet.this.getRightInset();
                    if (BottomSheet.this.useSmoothKeyboard) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = (int) (measuredHeight - ((bottomSheet.lastInsets.getSystemWindowInsetBottom() * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress)) - (BottomSheet.this.drawNavigationBar ? 0 : bottomSheet2.getBottomInset())));
                        if (i15 >= 29) {
                            measuredHeight -= BottomSheet.this.getAdditionalMandatoryOffsets();
                        }
                    }
                }
                int measuredWidth = ((i13 - i14) - BottomSheet.this.containerView.getMeasuredWidth()) / 2;
                if (BottomSheet.this.lastInsets != null && Build.VERSION.SDK_INT >= 21) {
                    measuredWidth += BottomSheet.this.getLeftInset();
                }
                BottomSheet bottomSheet3 = BottomSheet.this;
                if (bottomSheet3.smoothKeyboardAnimationEnabled && bottomSheet3.startAnimationRunnable == null && this.keyboardChanged && !bottomSheet3.dismissed && BottomSheet.this.containerView.getTop() != measuredHeight) {
                    BottomSheet.this.containerView.setTranslationY(viewGroup.getTop() - measuredHeight);
                    if (BottomSheet.this.keyboardContentAnimator != null) {
                        BottomSheet.this.keyboardContentAnimator.cancel();
                    }
                    BottomSheet bottomSheet4 = BottomSheet.this;
                    bottomSheet4.keyboardContentAnimator = ValueAnimator.ofFloat(bottomSheet4.containerView.getTranslationY(), 0.0f);
                    BottomSheet.this.keyboardContentAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.BottomSheet$ContainerView$$ExternalSyntheticLambda0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            BottomSheet.ContainerView.this.lambda$onLayout$1(valueAnimator);
                        }
                    });
                    BottomSheet.this.keyboardContentAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.BottomSheet.ContainerView.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            BottomSheet.this.containerView.setTranslationY(0.0f);
                            ContainerView.this.invalidate();
                        }
                    });
                    BottomSheet.this.keyboardContentAnimator.setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    BottomSheet.this.keyboardContentAnimator.start();
                }
                ViewGroup viewGroup3 = BottomSheet.this.containerView;
                viewGroup3.layout(measuredWidth, measuredHeight, viewGroup3.getMeasuredWidth() + measuredWidth, BottomSheet.this.containerView.getMeasuredHeight() + measuredHeight);
                i6 = i14;
                i5 = i13;
            } else {
                i6 = i;
                i5 = i3;
            }
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() != 8) {
                    BottomSheet bottomSheet5 = BottomSheet.this;
                    if (childAt != bottomSheet5.containerView) {
                        if (!bottomSheet5.onCustomLayout(childAt, i6, i2, i5, i4 - (bottomSheet5.drawNavigationBar ? bottomSheet5.getBottomInset() : 0))) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i17 = layoutParams.gravity;
                            if (i17 == -1) {
                                i17 = 51;
                            }
                            int i18 = i17 & 7;
                            int i19 = i17 & 112;
                            int i20 = i18 & 7;
                            if (i20 == 1) {
                                i12 = (((i5 - i6) - measuredWidth2) / 2) + layoutParams.leftMargin;
                                i11 = layoutParams.rightMargin;
                            } else if (i20 == 5) {
                                i12 = i5 - measuredWidth2;
                                i11 = layoutParams.rightMargin;
                            } else {
                                i7 = layoutParams.leftMargin;
                                if (i19 != 16) {
                                    i9 = (((i4 - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                                    i10 = layoutParams.bottomMargin;
                                } else if (i19 == 80) {
                                    i9 = (i4 - i2) - measuredHeight2;
                                    i10 = layoutParams.bottomMargin;
                                } else {
                                    i8 = layoutParams.topMargin;
                                    if (BottomSheet.this.lastInsets != null && Build.VERSION.SDK_INT >= 21) {
                                        i7 += BottomSheet.this.getLeftInset();
                                    }
                                    childAt.layout(i7, i8, measuredWidth2 + i7, measuredHeight2 + i8);
                                }
                                i8 = i9 - i10;
                                if (BottomSheet.this.lastInsets != null) {
                                    i7 += BottomSheet.this.getLeftInset();
                                }
                                childAt.layout(i7, i8, measuredWidth2 + i7, measuredHeight2 + i8);
                            }
                            i7 = i12 - i11;
                            if (i19 != 16) {
                            }
                            i8 = i9 - i10;
                            if (BottomSheet.this.lastInsets != null) {
                            }
                            childAt.layout(i7, i8, measuredWidth2 + i7, measuredHeight2 + i8);
                        }
                    }
                }
            }
            if (BottomSheet.this.layoutCount == 0 && (runnable = BottomSheet.this.startAnimationRunnable) != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                BottomSheet.this.startAnimationRunnable.run();
                BottomSheet.this.startAnimationRunnable = null;
            }
            this.keyboardChanged = false;
        }

        public /* synthetic */ void lambda$onLayout$1(ValueAnimator valueAnimator) {
            BottomSheet.this.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            invalidate();
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (BottomSheet.this.canDismissWithSwipe()) {
                return processTouchEvent(motionEvent, true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z) {
            if (this.maybeStartTracking && !this.startedTracking) {
                onTouchEvent(null);
            }
            super.requestDisallowInterceptTouchEvent(z);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void dispatchDraw(Canvas canvas) {
            BottomSheet bottomSheet;
            BottomSheet bottomSheet2;
            BottomSheet bottomSheet3;
            BottomSheet bottomSheet4;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                BottomSheet bottomSheet5 = BottomSheet.this;
                String str = bottomSheet5.navBarColorKey;
                if (str != null) {
                    this.backgroundPaint.setColor(bottomSheet5.getThemedColor(str));
                } else {
                    this.backgroundPaint.setColor(bottomSheet5.navBarColor);
                }
            } else {
                this.backgroundPaint.setColor(-16777216);
            }
            BottomSheet bottomSheet6 = BottomSheet.this;
            float f = 1.0f;
            if (bottomSheet6.drawDoubleNavigationBar && !bottomSheet6.shouldOverlayCameraViewOverNavBar()) {
                drawNavigationBar(canvas, 1.0f);
            }
            if (this.backgroundPaint.getAlpha() < 255) {
                BottomSheet bottomSheet7 = BottomSheet.this;
                if (bottomSheet7.drawNavigationBar) {
                    float max = (bottomSheet7.scrollNavBar || (i >= 29 && bottomSheet7.getAdditionalMandatoryOffsets() > 0)) ? Math.max(0.0f, BottomSheet.this.getBottomInset() - (BottomSheet.this.containerView.getMeasuredHeight() - BottomSheet.this.containerView.getTranslationY())) : 0.0f;
                    BottomSheet bottomSheet8 = BottomSheet.this;
                    int bottomInset = bottomSheet8.drawNavigationBar ? bottomSheet8.getBottomInset() : 0;
                    canvas.save();
                    canvas.clipRect(BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + max) - BottomSheet.this.currentPanTranslationY, BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight() + max, Region.Op.DIFFERENCE);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    if (!BottomSheet.this.shouldOverlayCameraViewOverNavBar()) {
                        BottomSheet bottomSheet9 = BottomSheet.this;
                        if (bottomSheet9.drawDoubleNavigationBar) {
                            f = bottomSheet9.navigationBarAlpha * 0.7f;
                        }
                        drawNavigationBar(canvas, f);
                    }
                    bottomSheet = BottomSheet.this;
                    if (bottomSheet.drawNavigationBar && bottomSheet.rightInset != 0 && BottomSheet.this.rightInset > BottomSheet.this.leftInset) {
                        bottomSheet4 = BottomSheet.this;
                        if (bottomSheet4.fullWidth) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                int right = bottomSheet4.containerView.getRight();
                                BottomSheet bottomSheet10 = BottomSheet.this;
                                canvas.drawRect(right - bottomSheet10.backgroundPaddingLeft, bottomSheet10.containerView.getTranslationY(), BottomSheet.this.containerView.getRight() + BottomSheet.this.rightInset, getMeasuredHeight(), this.backgroundPaint);
                            }
                        }
                    }
                    bottomSheet2 = BottomSheet.this;
                    if (bottomSheet2.drawNavigationBar && bottomSheet2.leftInset != 0 && BottomSheet.this.leftInset > BottomSheet.this.rightInset) {
                        bottomSheet3 = BottomSheet.this;
                        if (bottomSheet3.fullWidth) {
                            Point point2 = AndroidUtilities.displaySize;
                            if (point2.x > point2.y) {
                                canvas.drawRect(0.0f, bottomSheet3.containerView.getTranslationY(), BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight(), this.backgroundPaint);
                            }
                        }
                    }
                    if (BottomSheet.this.containerView.getTranslationY() < 0.0f) {
                        return;
                    }
                    Paint paint = this.backgroundPaint;
                    BottomSheet bottomSheet11 = BottomSheet.this;
                    String str2 = bottomSheet11.behindKeyboardColorKey;
                    paint.setColor(str2 != null ? bottomSheet11.getThemedColor(str2) : bottomSheet11.behindKeyboardColor);
                    int left = BottomSheet.this.containerView.getLeft();
                    BottomSheet bottomSheet12 = BottomSheet.this;
                    canvas.drawRect(left + bottomSheet12.backgroundPaddingLeft, bottomSheet12.containerView.getY() + BottomSheet.this.containerView.getMeasuredHeight(), BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight(), this.backgroundPaint);
                    return;
                }
            }
            super.dispatchDraw(canvas);
            if (!BottomSheet.this.shouldOverlayCameraViewOverNavBar()) {
            }
            bottomSheet = BottomSheet.this;
            if (bottomSheet.drawNavigationBar) {
                bottomSheet4 = BottomSheet.this;
                if (bottomSheet4.fullWidth) {
                }
            }
            bottomSheet2 = BottomSheet.this;
            if (bottomSheet2.drawNavigationBar) {
                bottomSheet3 = BottomSheet.this;
                if (bottomSheet3.fullWidth) {
                }
            }
            if (BottomSheet.this.containerView.getTranslationY() < 0.0f) {
            }
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view instanceof CameraView) {
                if (BottomSheet.this.shouldOverlayCameraViewOverNavBar()) {
                    drawNavigationBar(canvas, 1.0f);
                }
                return super.drawChild(canvas, view, j);
            }
            return super.drawChild(canvas, view, j);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onDraw(Canvas canvas) {
            boolean z;
            BottomSheet bottomSheet;
            int i = 0;
            if (this.backgroundPaint.getAlpha() < 255) {
                BottomSheet bottomSheet2 = BottomSheet.this;
                if (bottomSheet2.drawNavigationBar) {
                    float f = 0.0f;
                    if (bottomSheet2.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && bottomSheet2.getAdditionalMandatoryOffsets() > 0)) {
                        f = Math.max(0.0f, BottomSheet.this.getBottomInset() - (BottomSheet.this.containerView.getMeasuredHeight() - BottomSheet.this.containerView.getTranslationY()));
                    }
                    BottomSheet bottomSheet3 = BottomSheet.this;
                    int bottomInset = bottomSheet3.drawNavigationBar ? bottomSheet3.getBottomInset() : 0;
                    canvas.save();
                    canvas.clipRect(BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f) - BottomSheet.this.currentPanTranslationY, BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight() + f, Region.Op.DIFFERENCE);
                    z = true;
                    super.onDraw(canvas);
                    if (BottomSheet.this.lastInsets != null && this.keyboardHeight != 0) {
                        Paint paint = this.backgroundPaint;
                        BottomSheet bottomSheet4 = BottomSheet.this;
                        String str = bottomSheet4.behindKeyboardColorKey;
                        paint.setColor(str == null ? bottomSheet4.getThemedColor(str) : bottomSheet4.behindKeyboardColor);
                        float left = BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft;
                        int measuredHeight = getMeasuredHeight() - this.keyboardHeight;
                        BottomSheet bottomSheet5 = BottomSheet.this;
                        float bottomInset2 = measuredHeight - (!bottomSheet5.drawNavigationBar ? bottomSheet5.getBottomInset() : 0);
                        float right = BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft;
                        int measuredHeight2 = getMeasuredHeight();
                        bottomSheet = BottomSheet.this;
                        if (bottomSheet.drawNavigationBar) {
                            i = bottomSheet.getBottomInset();
                        }
                        canvas.drawRect(left, bottomInset2, right, measuredHeight2 - i, this.backgroundPaint);
                    }
                    BottomSheet.this.onContainerDraw(canvas);
                    if (z) {
                        return;
                    }
                    canvas.restore();
                    return;
                }
            }
            z = false;
            super.onDraw(canvas);
            if (BottomSheet.this.lastInsets != null) {
                Paint paint2 = this.backgroundPaint;
                BottomSheet bottomSheet42 = BottomSheet.this;
                String str2 = bottomSheet42.behindKeyboardColorKey;
                paint2.setColor(str2 == null ? bottomSheet42.getThemedColor(str2) : bottomSheet42.behindKeyboardColor);
                float left2 = BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft;
                int measuredHeight3 = getMeasuredHeight() - this.keyboardHeight;
                BottomSheet bottomSheet52 = BottomSheet.this;
                float bottomInset22 = measuredHeight3 - (!bottomSheet52.drawNavigationBar ? bottomSheet52.getBottomInset() : 0);
                float right2 = BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft;
                int measuredHeight22 = getMeasuredHeight();
                bottomSheet = BottomSheet.this;
                if (bottomSheet.drawNavigationBar) {
                }
                canvas.drawRect(left2, bottomInset22, right2, measuredHeight22 - i, this.backgroundPaint);
            }
            BottomSheet.this.onContainerDraw(canvas);
            if (z) {
            }
        }

        public void drawNavigationBar(Canvas canvas, float f) {
            float f2;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                BottomSheet bottomSheet = BottomSheet.this;
                String str = bottomSheet.navBarColorKey;
                if (str != null) {
                    this.backgroundPaint.setColor(bottomSheet.getThemedColor(str));
                } else {
                    this.backgroundPaint.setColor(bottomSheet.navBarColor);
                }
            } else {
                this.backgroundPaint.setColor(-16777216);
            }
            BottomSheet bottomSheet2 = BottomSheet.this;
            float f3 = 0.0f;
            if ((!bottomSheet2.drawNavigationBar || bottomSheet2.bottomInset == 0) && BottomSheet.this.currentPanTranslationY == 0.0f) {
                return;
            }
            BottomSheet bottomSheet3 = BottomSheet.this;
            int bottomInset = bottomSheet3.drawNavigationBar ? bottomSheet3.getBottomInset() : 0;
            BottomSheet bottomSheet4 = BottomSheet.this;
            if (bottomSheet4.scrollNavBar || (i >= 29 && bottomSheet4.getAdditionalMandatoryOffsets() > 0)) {
                BottomSheet bottomSheet5 = BottomSheet.this;
                if (bottomSheet5.drawDoubleNavigationBar) {
                    f2 = Math.max(0.0f, Math.min(bottomInset - bottomSheet5.currentPanTranslationY, BottomSheet.this.containerView.getTranslationY()));
                } else {
                    f2 = Math.max(0.0f, BottomSheet.this.getBottomInset() - (bottomSheet5.containerView.getMeasuredHeight() - BottomSheet.this.containerView.getTranslationY()));
                }
            } else {
                f2 = 0.0f;
            }
            int alpha = this.backgroundPaint.getAlpha();
            if (f < 1.0f) {
                this.backgroundPaint.setAlpha((int) (alpha * f));
            }
            canvas.drawRect(BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f2) - BottomSheet.this.currentPanTranslationY, BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight() + f2, this.backgroundPaint);
            this.backgroundPaint.setAlpha(alpha);
            if (BottomSheet.this.overlayDrawNavBarColor == 0) {
                return;
            }
            this.backgroundPaint.setColor(BottomSheet.this.overlayDrawNavBarColor);
            int alpha2 = this.backgroundPaint.getAlpha();
            if (f < 1.0f) {
                this.backgroundPaint.setAlpha((int) (alpha2 * f));
            } else {
                f3 = f2;
            }
            canvas.drawRect(BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f3) - BottomSheet.this.currentPanTranslationY, BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight() + f3, this.backgroundPaint);
            this.backgroundPaint.setAlpha(alpha2);
        }
    }

    protected int getBottomSheetWidth(boolean z, int i, int i2) {
        return z ? i : (int) Math.max(i * 0.8f, Math.min(AndroidUtilities.dp(480.0f), i));
    }

    public void setHideSystemVerticalInsets(boolean z) {
        float[] fArr = new float[2];
        fArr[0] = this.hideSystemVerticalInsetsProgress;
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(180L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSheet.this.lambda$setHideSystemVerticalInsets$0(valueAnimator);
            }
        });
        duration.start();
    }

    public /* synthetic */ void lambda$setHideSystemVerticalInsets$0(ValueAnimator valueAnimator) {
        this.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.container.requestLayout();
        this.containerView.requestLayout();
    }

    public int getAdditionalMandatoryOffsets() {
        if (!this.calcMandatoryInsets) {
            return 0;
        }
        Insets systemGestureInsets = this.lastInsets.getSystemGestureInsets();
        if (this.keyboardVisible || !this.drawNavigationBar || systemGestureInsets == null) {
            return 0;
        }
        if (systemGestureInsets.left != 0 || systemGestureInsets.right != 0) {
            return systemGestureInsets.bottom;
        }
        return 0;
    }

    public void setCalcMandatoryInsets(boolean z) {
        this.calcMandatoryInsets = z;
        this.drawNavigationBar = z;
    }

    /* loaded from: classes3.dex */
    public static class BottomSheetCell extends FrameLayout {
        int currentType;
        private ImageView imageView;
        public boolean isSelected;
        private final Theme.ResourcesProvider resourcesProvider;
        private TextView textView;

        public BottomSheetCell(Context context, int i) {
            this(context, i, null);
        }

        public BottomSheetCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.isSelected = false;
            this.resourcesProvider = resourcesProvider;
            this.currentType = i;
            setBackgroundDrawable(Theme.getSelectorDrawable(false));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogIcon"), PorterDuff.Mode.MULTIPLY));
            int i2 = 5;
            addView(this.imageView, LayoutHelper.createFrame(56, 48, (LocaleController.isRTL ? 5 : 3) | 16));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 0) {
                this.textView.setTextColor(getThemedColor("dialogTextBlack"));
                this.textView.setTextSize(1, 16.0f);
                addView(this.textView, LayoutHelper.createFrame(-2, -2, (!LocaleController.isRTL ? 3 : i2) | 16));
            } else if (i == 1) {
                this.textView.setGravity(17);
                this.textView.setTextColor(getThemedColor("dialogTextBlack"));
                this.textView.setTextSize(1, 14.0f);
                this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                addView(this.textView, LayoutHelper.createFrame(-1, -1.0f));
            } else if (i != 2) {
            } else {
                this.textView.setGravity(17);
                this.textView.setTextColor(getThemedColor("featuredStickers_buttonText"));
                this.textView.setTextSize(1, 14.0f);
                this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.textView.setBackground(Theme.AdaptiveRipple.filledRect(getThemedColor("featuredStickers_addButton"), 4.0f));
                addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int i3 = this.currentType;
            int i4 = i3 == 2 ? 80 : 48;
            if (i3 == 0) {
                i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i4), 1073741824));
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }

        public void setIconColor(int i) {
            this.imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }

        public void setGravity(int i) {
            this.textView.setGravity(i);
        }

        public void setTextAndIcon(CharSequence charSequence, int i) {
            setTextAndIcon(charSequence, i, null, false);
        }

        public void setTextAndIcon(CharSequence charSequence, Drawable drawable) {
            setTextAndIcon(charSequence, 0, drawable, false);
        }

        public void setTextAndIcon(CharSequence charSequence, int i, Drawable drawable, boolean z) {
            this.textView.setText(charSequence);
            float f = 21.0f;
            float f2 = 16.0f;
            if (i != 0 || drawable != null) {
                if (drawable != null) {
                    this.imageView.setImageDrawable(drawable);
                } else {
                    this.imageView.setImageResource(i);
                }
                this.imageView.setVisibility(0);
                if (z) {
                    TextView textView = this.textView;
                    int dp = AndroidUtilities.dp(LocaleController.isRTL ? 21.0f : 72.0f);
                    if (LocaleController.isRTL) {
                        f = 72.0f;
                    }
                    textView.setPadding(dp, 0, AndroidUtilities.dp(f), 0);
                    this.imageView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(5.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(5.0f) : 5, 0);
                    return;
                }
                TextView textView2 = this.textView;
                int dp2 = AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 72.0f);
                if (LocaleController.isRTL) {
                    f2 = 72.0f;
                }
                textView2.setPadding(dp2, 0, AndroidUtilities.dp(f2), 0);
                this.imageView.setPadding(0, 0, 0, 0);
                return;
            }
            this.imageView.setVisibility(4);
            TextView textView3 = this.textView;
            int dp3 = AndroidUtilities.dp(z ? 21.0f : 16.0f);
            if (!z) {
                f = 16.0f;
            }
            textView3.setPadding(dp3, 0, AndroidUtilities.dp(f), 0);
        }

        public TextView getTextView() {
            return this.textView;
        }

        public ImageView getImageView() {
            return this.imageView;
        }

        private int getThemedColor(String str) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
            return color != null ? color.intValue() : Theme.getColor(str);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.isSelected) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
    }

    public void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
        if (!z) {
            this.containerView.setTranslationY(0.0f);
        }
    }

    public BottomSheet(Context context, boolean z) {
        this(context, z, null);
    }

    public BottomSheet(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.allowDrawContent = true;
        this.useHardwareLayer = true;
        this.backDrawable = new ColorDrawable(-16777216) { // from class: org.telegram.ui.ActionBar.BottomSheet.1
            @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
            public void setAlpha(int i) {
                super.setAlpha(i);
                BottomSheet.this.container.invalidate();
            }
        };
        this.useLightStatusBar = true;
        this.behindKeyboardColorKey = "dialogBackground";
        this.canDismissWithSwipe = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new Runnable() { // from class: org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                BottomSheet.this.dismiss();
            }
        };
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = "windowBackgroundGray";
        this.useBackgroundTopPadding = true;
        this.resourcesProvider = resourcesProvider;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            getWindow().addFlags(-2147483392);
        } else if (i >= 21) {
            getWindow().addFlags(-2147417856);
        }
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        ContainerView containerView = new ContainerView(getContext()) { // from class: org.telegram.ui.ActionBar.BottomSheet.2
            @Override // org.telegram.ui.ActionBar.BottomSheet.ContainerView, android.view.ViewGroup
            public boolean drawChild(Canvas canvas, View view, long j) {
                try {
                    if (BottomSheet.this.allowDrawContent) {
                        if (super.drawChild(canvas, view, j)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    FileLog.e(e);
                    return true;
                }
            }

            @Override // org.telegram.ui.ActionBar.BottomSheet.ContainerView, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                BottomSheet.this.mainContainerDispatchDraw(canvas);
            }
        };
        this.container = containerView;
        containerView.setBackgroundDrawable(this.backDrawable);
        this.focusable = z;
        if (i >= 21) {
            this.container.setFitsSystemWindows(true);
            this.container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda3
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$new$1;
                    lambda$new$1 = BottomSheet.this.lambda$new$1(view, windowInsets);
                    return lambda$new$1;
                }
            });
            if (i >= 30) {
                this.container.setSystemUiVisibility(1792);
            } else {
                this.container.setSystemUiVisibility(1280);
            }
        }
        this.backDrawable.setAlpha(0);
    }

    public /* synthetic */ WindowInsets lambda$new$1(View view, WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || AndroidUtilities.isInMultiwindow) && this.statusBarHeight != systemWindowInsetTop) {
            this.statusBarHeight = systemWindowInsetTop;
        }
        this.lastInsets = windowInsets;
        view.requestLayout();
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public void fixNavigationBar() {
        fixNavigationBar(getThemedColor("dialogBackground"));
    }

    public void fixNavigationBar(int i) {
        this.drawNavigationBar = true;
        this.drawDoubleNavigationBar = true;
        this.scrollNavBar = true;
        this.navBarColorKey = null;
        this.navBarColor = i;
        setOverlayNavBarColor(i);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.container, new ViewGroup.LayoutParams(-1, -1));
        Drawable drawable = null;
        if (this.useLightStatusBar && Build.VERSION.SDK_INT >= 23 && Theme.getColor("actionBarDefault", null, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar(getWindow(), false);
        }
        if (this.containerView == null) {
            FrameLayout frameLayout = new FrameLayout(getContext()) { // from class: org.telegram.ui.ActionBar.BottomSheet.3
                @Override // android.view.View
                public boolean hasOverlappingRendering() {
                    return false;
                }

                @Override // android.view.View
                public void setTranslationY(float f) {
                    super.setTranslationY(f);
                    BottomSheet.this.onContainerTranslationYChanged(f);
                }
            };
            this.containerView = frameLayout;
            frameLayout.setBackgroundDrawable(this.shadowDrawable);
            this.containerView.setPadding(this.backgroundPaddingLeft, ((this.applyTopPadding ? AndroidUtilities.dp(8.0f) : 0) + this.backgroundPaddingTop) - 1, this.backgroundPaddingLeft, this.applyBottomPadding ? AndroidUtilities.dp(8.0f) : 0);
        }
        this.containerView.setVisibility(4);
        this.container.addView(this.containerView, 0, LayoutHelper.createFrame(-1, -2, 80));
        int i = 48;
        if (this.title != null) {
            TextView textView = new TextView(getContext()) { // from class: org.telegram.ui.ActionBar.BottomSheet.4
                @Override // android.widget.TextView, android.view.View
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, i3);
                    if (BottomSheet.this.multipleLinesTitle) {
                        int measuredHeight = getMeasuredHeight();
                        if (BottomSheet.this.customView != null) {
                            ((ViewGroup.MarginLayoutParams) BottomSheet.this.customView.getLayoutParams()).topMargin = measuredHeight;
                        } else if (BottomSheet.this.containerView != null) {
                            for (int i4 = 1; i4 < BottomSheet.this.containerView.getChildCount(); i4++) {
                                View childAt = BottomSheet.this.containerView.getChildAt(i4);
                                if (childAt instanceof BottomSheetCell) {
                                    ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                    measuredHeight += AndroidUtilities.dp(48.0f);
                                }
                            }
                        }
                    }
                }
            };
            this.titleView = textView;
            textView.setText(this.title);
            if (this.bigTitle) {
                this.titleView.setTextColor(getThemedColor("dialogTextBlack"));
                this.titleView.setTextSize(1, 20.0f);
                this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.titleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 14.0f : 6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            } else {
                this.titleView.setTextColor(getThemedColor("dialogTextGray2"));
                this.titleView.setTextSize(1, 16.0f);
                this.titleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 8.0f : 0.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            }
            if (this.multipleLinesTitle) {
                this.titleView.setSingleLine(false);
                this.titleView.setMaxLines(5);
                this.titleView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.titleView.setLines(1);
                this.titleView.setSingleLine(true);
                this.titleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.titleView.setGravity(16);
            this.containerView.addView(this.titleView, LayoutHelper.createFrame(-1, this.multipleLinesTitle ? -2.0f : 48));
            this.titleView.setOnTouchListener(BottomSheet$$ExternalSyntheticLambda5.INSTANCE);
        } else {
            i = 0;
        }
        View view = this.customView;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            if (!this.useBackgroundTopPadding) {
                this.containerView.setClipToPadding(false);
                this.containerView.setClipChildren(false);
                this.container.setClipToPadding(false);
                this.container.setClipChildren(false);
                this.containerView.addView(this.customView, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, (-this.backgroundPaddingTop) + i, 0.0f, 0.0f));
            } else {
                this.containerView.addView(this.customView, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, i, 0.0f, 0.0f));
            }
        } else if (this.items != null) {
            int i2 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i2 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i2] != null) {
                    BottomSheetCell bottomSheetCell = new BottomSheetCell(getContext(), 0, this.resourcesProvider);
                    CharSequence charSequence = this.items[i2];
                    int[] iArr = this.itemIcons;
                    bottomSheetCell.setTextAndIcon(charSequence, iArr != null ? iArr[i2] : 0, drawable, this.bigTitle);
                    this.containerView.addView(bottomSheetCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, i, 0.0f, 0.0f));
                    i += 48;
                    bottomSheetCell.setTag(Integer.valueOf(i2));
                    bottomSheetCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BottomSheet.this.lambda$onCreate$3(view2);
                        }
                    });
                    this.itemViews.add(bottomSheetCell);
                }
                i2++;
                drawable = null;
            }
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.flags = i3;
        if (this.focusable) {
            attributes.softInputMode = 16;
        } else {
            attributes.flags = i3 | 131072;
        }
        if (this.isFullscreen) {
            if (Build.VERSION.SDK_INT >= 21) {
                attributes.flags |= -2147417856;
            }
            attributes.flags |= 1024;
            this.container.setSystemUiVisibility(1284);
        }
        attributes.height = -1;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
    }

    public /* synthetic */ void lambda$onCreate$3(View view) {
        dismissWithButtonClick(((Integer) view.getTag()).intValue());
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    public void setUseLightStatusBar(boolean z) {
        this.useLightStatusBar = z;
        if (Build.VERSION.SDK_INT >= 23) {
            int color = Theme.getColor("actionBarDefault", null, true);
            int systemUiVisibility = this.container.getSystemUiVisibility();
            this.container.setSystemUiVisibility((!this.useLightStatusBar || color != -1) ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        }
    }

    public boolean isFocusable() {
        return this.focusable;
    }

    public void setFocusable(boolean z) {
        if (this.focusable == z) {
            return;
        }
        this.focusable = z;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.focusable) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public void setShowWithoutAnimation(boolean z) {
        this.showWithoutAnimation = z;
    }

    public void setBackgroundColor(int i) {
        this.shadowDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (this.focusable) {
            getWindow().setSoftInputMode(16);
        }
        int i = 0;
        this.dismissed = false;
        cancelSheetAnimation();
        this.containerView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x + (this.backgroundPaddingLeft * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        float f = 0.0f;
        if (this.showWithoutAnimation) {
            ColorDrawable colorDrawable = this.backDrawable;
            if (this.dimBehind) {
                i = this.dimBehindAlpha;
            }
            colorDrawable.setAlpha(i);
            this.containerView.setTranslationY(0.0f);
            return;
        }
        this.backDrawable.setAlpha(0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18) {
            this.layoutCount = 2;
            ViewGroup viewGroup = this.containerView;
            if (i2 >= 21) {
                f = (1.0f - this.hideSystemVerticalInsetsProgress) * AndroidUtilities.statusBarHeight;
            }
            float measuredHeight = f + viewGroup.getMeasuredHeight();
            if (this.scrollNavBar) {
                i = getBottomInset();
            }
            viewGroup.setTranslationY(measuredHeight + i);
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.ActionBar.BottomSheet.5
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheet bottomSheet = BottomSheet.this;
                    if (bottomSheet.startAnimationRunnable != this || bottomSheet.dismissed) {
                        return;
                    }
                    BottomSheet bottomSheet2 = BottomSheet.this;
                    bottomSheet2.startAnimationRunnable = null;
                    bottomSheet2.startOpenAnimation();
                }
            };
            this.startAnimationRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, this.openNoDelay ? 0L : 150L);
            return;
        }
        startOpenAnimation();
    }

    public ColorDrawable getBackDrawable() {
        return this.backDrawable;
    }

    public int getBackgroundPaddingTop() {
        return this.backgroundPaddingTop;
    }

    public void setAllowDrawContent(boolean z) {
        if (this.allowDrawContent != z) {
            this.allowDrawContent = z;
            this.container.setBackgroundDrawable(z ? this.backDrawable : null);
            this.container.invalidate();
        }
    }

    protected boolean canDismissWithSwipe() {
        return this.canDismissWithSwipe;
    }

    public void setCanDismissWithSwipe(boolean z) {
        this.canDismissWithSwipe = z;
    }

    public void setCustomView(View view) {
        this.customView = view;
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false);
    }

    public void setTitle(CharSequence charSequence, boolean z) {
        this.title = charSequence;
        this.bigTitle = z;
    }

    public void setApplyTopPadding(boolean z) {
        this.applyTopPadding = z;
    }

    public void setApplyBottomPadding(boolean z) {
        this.applyBottomPadding = z;
    }

    protected void onDismissWithTouchOutside() {
        dismiss();
    }

    public TextView getTitleView() {
        return this.titleView;
    }

    protected void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.currentSheetAnimation = null;
        }
        this.currentSheetAnimationType = 0;
    }

    public void setOnHideListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onHideListener = onDismissListener;
    }

    public void startOpenAnimation() {
        if (this.dismissed) {
            return;
        }
        this.containerView.setVisibility(0);
        if (onCustomOpenAnimation()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 20 && this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.containerView.setTranslationY(getContainerViewHeight() + this.container.keyboardHeight + AndroidUtilities.dp(10.0f) + (this.scrollNavBar ? getBottomInset() : 0));
        this.currentSheetAnimationType = 1;
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BottomSheet.this.lambda$startOpenAnimation$4(valueAnimator2);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.currentSheetAnimation = animatorSet;
        Animator[] animatorArr = new Animator[3];
        animatorArr[0] = ObjectAnimator.ofFloat(this.containerView, View.TRANSLATION_Y, 0.0f);
        ColorDrawable colorDrawable = this.backDrawable;
        Property<ColorDrawable, Integer> property = AnimationProperties.COLOR_DRAWABLE_ALPHA;
        int[] iArr = new int[1];
        iArr[0] = this.dimBehind ? this.dimBehindAlpha : 0;
        animatorArr[1] = ObjectAnimator.ofInt(colorDrawable, property, iArr);
        animatorArr[2] = this.navigationBarAnimation;
        animatorSet.playTogether(animatorArr);
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        this.currentSheetAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.BottomSheet.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AnimatorSet animatorSet2 = BottomSheet.this.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    BottomSheet bottomSheet = BottomSheet.this;
                    bottomSheet.currentSheetAnimation = null;
                    bottomSheet.currentSheetAnimationType = 0;
                    BottomSheetDelegateInterface bottomSheetDelegateInterface = bottomSheet.delegate;
                    if (bottomSheetDelegateInterface != null) {
                        bottomSheetDelegateInterface.onOpenAnimationEnd();
                    }
                    BottomSheet bottomSheet2 = BottomSheet.this;
                    if (bottomSheet2.useHardwareLayer) {
                        bottomSheet2.container.setLayerType(0, null);
                    }
                    BottomSheet bottomSheet3 = BottomSheet.this;
                    if (bottomSheet3.isFullscreen) {
                        WindowManager.LayoutParams attributes = bottomSheet3.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        BottomSheet.this.getWindow().setAttributes(attributes);
                    }
                }
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AnimatorSet animatorSet2 = BottomSheet.this.currentSheetAnimation;
                if (animatorSet2 == null || !animatorSet2.equals(animator)) {
                    return;
                }
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.currentSheetAnimation = null;
                bottomSheet.currentSheetAnimationType = 0;
            }
        });
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
    }

    public /* synthetic */ void lambda$startOpenAnimation$4(ValueAnimator valueAnimator) {
        this.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public void setDelegate(BottomSheetDelegateInterface bottomSheetDelegateInterface) {
        this.delegate = bottomSheetDelegateInterface;
    }

    public FrameLayout getContainer() {
        return this.container;
    }

    public ViewGroup getSheetContainer() {
        return this.containerView;
    }

    public int getTag() {
        return this.tag;
    }

    public void setDimBehind(boolean z) {
        this.dimBehind = z;
    }

    public void setDimBehindAlpha(int i) {
        this.dimBehindAlpha = i;
    }

    public void setItemText(int i, CharSequence charSequence) {
        if (i < 0 || i >= this.itemViews.size()) {
            return;
        }
        this.itemViews.get(i).textView.setText(charSequence);
    }

    public void setItemColor(int i, int i2, int i3) {
        if (i < 0 || i >= this.itemViews.size()) {
            return;
        }
        BottomSheetCell bottomSheetCell = this.itemViews.get(i);
        bottomSheetCell.textView.setTextColor(i2);
        bottomSheetCell.imageView.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
    }

    public ArrayList<BottomSheetCell> getItemViews() {
        return this.itemViews;
    }

    public void setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
        this.items = charSequenceArr;
        this.itemIcons = iArr;
        this.onClickListener = onClickListener;
    }

    public void setTitleColor(int i) {
        TextView textView = this.titleView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public boolean isDismissed() {
        return this.dismissed;
    }

    public void dismissWithButtonClick(int i) {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        cancelSheetAnimation();
        this.currentSheetAnimationType = 2;
        AnimatorSet animatorSet = new AnimatorSet();
        this.currentSheetAnimation = animatorSet;
        Animator[] animatorArr = new Animator[2];
        ViewGroup viewGroup = this.containerView;
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[1];
        fArr[0] = getContainerViewHeight() + this.container.keyboardHeight + AndroidUtilities.dp(10.0f) + (this.scrollNavBar ? getBottomInset() : 0);
        animatorArr[0] = ObjectAnimator.ofFloat(viewGroup, property, fArr);
        animatorArr[1] = ObjectAnimator.ofInt(this.backDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
        animatorSet.playTogether(animatorArr);
        this.currentSheetAnimation.setDuration(180L);
        this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.currentSheetAnimation.addListener(new AnonymousClass7(i));
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
    }

    /* renamed from: org.telegram.ui.ActionBar.BottomSheet$7 */
    /* loaded from: classes3.dex */
    public class AnonymousClass7 extends AnimatorListenerAdapter {
        final /* synthetic */ int val$item;

        AnonymousClass7(int i) {
            BottomSheet.this = r1;
            this.val$item = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
            if (animatorSet != null && animatorSet.equals(animator)) {
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.currentSheetAnimation = null;
                bottomSheet.currentSheetAnimationType = 0;
                if (bottomSheet.onClickListener != null) {
                    BottomSheet.this.onClickListener.onClick(BottomSheet.this, this.val$item);
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ActionBar.BottomSheet$7$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomSheet.AnonymousClass7.this.lambda$onAnimationEnd$0();
                    }
                });
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
        }

        public /* synthetic */ void lambda$onAnimationEnd$0() {
            if (BottomSheet.this.onHideListener != null) {
                BottomSheet.this.onHideListener.onDismiss(BottomSheet.this);
            }
            try {
                BottomSheet.this.dismissInternal();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
            if (animatorSet == null || !animatorSet.equals(animator)) {
                return;
            }
            BottomSheet bottomSheet = BottomSheet.this;
            bottomSheet.currentSheetAnimation = null;
            bottomSheet.currentSheetAnimationType = 0;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.dismissed) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getContainerViewHeight() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        long j;
        ObjectAnimator objectAnimator;
        BottomSheetDelegateInterface bottomSheetDelegateInterface = this.delegate;
        if ((bottomSheetDelegateInterface == null || bottomSheetDelegateInterface.canDismiss()) && !this.dismissed) {
            this.dismissed = true;
            DialogInterface.OnDismissListener onDismissListener = this.onHideListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            cancelSheetAnimation();
            onDismissAnimationStart();
            if (!this.allowCustomAnimation || !onCustomCloseAnimation()) {
                this.currentSheetAnimationType = 2;
                this.currentSheetAnimation = new AnimatorSet();
                ValueAnimator valueAnimator = this.navigationBarAnimation;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 0.0f);
                this.navigationBarAnimation = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        BottomSheet.this.lambda$dismiss$5(valueAnimator2);
                    }
                });
                AnimatorSet animatorSet = this.currentSheetAnimation;
                Animator[] animatorArr = new Animator[3];
                ViewGroup viewGroup = this.containerView;
                if (viewGroup == null) {
                    objectAnimator = null;
                } else {
                    Property property = View.TRANSLATION_Y;
                    float[] fArr = new float[1];
                    fArr[0] = getContainerViewHeight() + this.container.keyboardHeight + AndroidUtilities.dp(10.0f) + (this.scrollNavBar ? getBottomInset() : 0);
                    objectAnimator = ObjectAnimator.ofFloat(viewGroup, property, fArr);
                }
                animatorArr[0] = objectAnimator;
                animatorArr[1] = ObjectAnimator.ofInt(this.backDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
                animatorArr[2] = this.navigationBarAnimation;
                animatorSet.playTogether(animatorArr);
                j = 250;
                this.currentSheetAnimation.setDuration(250L);
                this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.currentSheetAnimation.addListener(new AnonymousClass8());
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
                this.currentSheetAnimation.start();
            } else {
                j = 0;
            }
            Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
            if (visibleBulletin == null || !visibleBulletin.isShowing()) {
                return;
            }
            if (j > 0) {
                visibleBulletin.hide(((float) j) * 0.6f);
            } else {
                visibleBulletin.hide();
            }
        }
    }

    public /* synthetic */ void lambda$dismiss$5(ValueAnimator valueAnimator) {
        this.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    /* renamed from: org.telegram.ui.ActionBar.BottomSheet$8 */
    /* loaded from: classes3.dex */
    public class AnonymousClass8 extends AnimatorListenerAdapter {
        AnonymousClass8() {
            BottomSheet.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
            if (animatorSet != null && animatorSet.equals(animator)) {
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.currentSheetAnimation = null;
                bottomSheet.currentSheetAnimationType = 0;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ActionBar.BottomSheet$8$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomSheet.AnonymousClass8.this.lambda$onAnimationEnd$0();
                    }
                });
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
        }

        public /* synthetic */ void lambda$onAnimationEnd$0() {
            try {
                BottomSheet.this.dismissInternal();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
            if (animatorSet == null || !animatorSet.equals(animator)) {
                return;
            }
            BottomSheet bottomSheet = BottomSheet.this;
            bottomSheet.currentSheetAnimation = null;
            bottomSheet.currentSheetAnimationType = 0;
        }
    }

    public int getSheetAnimationType() {
        return this.currentSheetAnimationType;
    }

    public void dismissInternal() {
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        private BottomSheet bottomSheet;

        public Builder(Context context) {
            this(context, false);
        }

        public Builder(Context context, boolean z) {
            this(context, z, null);
        }

        public Builder(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            BottomSheet bottomSheet = new BottomSheet(context, z, resourcesProvider);
            this.bottomSheet = bottomSheet;
            bottomSheet.fixNavigationBar();
        }

        public Builder(Context context, boolean z, Theme.ResourcesProvider resourcesProvider, int i) {
            BottomSheet bottomSheet = new BottomSheet(context, z, resourcesProvider);
            this.bottomSheet = bottomSheet;
            bottomSheet.setBackgroundColor(i);
            this.bottomSheet.fixNavigationBar(i);
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.bottomSheet.items = charSequenceArr;
            this.bottomSheet.onClickListener = onClickListener;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
            this.bottomSheet.items = charSequenceArr;
            this.bottomSheet.itemIcons = iArr;
            this.bottomSheet.onClickListener = onClickListener;
            return this;
        }

        public Builder setCustomView(View view) {
            this.bottomSheet.customView = view;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            return setTitle(charSequence, false);
        }

        public Builder setTitle(CharSequence charSequence, boolean z) {
            this.bottomSheet.title = charSequence;
            this.bottomSheet.bigTitle = z;
            return this;
        }

        public Builder setTitleMultipleLines(boolean z) {
            this.bottomSheet.multipleLinesTitle = z;
            return this;
        }

        public BottomSheet create() {
            return this.bottomSheet;
        }

        public BottomSheet setDimBehind(boolean z) {
            BottomSheet bottomSheet = this.bottomSheet;
            bottomSheet.dimBehind = z;
            return bottomSheet;
        }

        public BottomSheet show() {
            this.bottomSheet.show();
            return this.bottomSheet;
        }

        public Builder setUseHardwareLayer(boolean z) {
            this.bottomSheet.useHardwareLayer = z;
            return this;
        }

        public Builder setDelegate(BottomSheetDelegate bottomSheetDelegate) {
            this.bottomSheet.setDelegate(bottomSheetDelegate);
            return this;
        }

        public Builder setApplyTopPadding(boolean z) {
            this.bottomSheet.applyTopPadding = z;
            return this;
        }

        public Builder setApplyBottomPadding(boolean z) {
            this.bottomSheet.applyBottomPadding = z;
            return this;
        }

        public Runnable getDismissRunnable() {
            return this.bottomSheet.dismissRunnable;
        }

        public Builder setOnPreDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.bottomSheet.setOnHideListener(onDismissListener);
            return this;
        }
    }

    public int getLeftInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets == null || Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        return (int) (windowInsets.getSystemWindowInsetLeft() * (1.0f - this.hideSystemVerticalInsetsProgress));
    }

    public int getRightInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets == null || Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        return (int) (windowInsets.getSystemWindowInsetRight() * (1.0f - this.hideSystemVerticalInsetsProgress));
    }

    public int getStatusBarHeight() {
        return (int) (this.statusBarHeight * (1.0f - this.hideSystemVerticalInsetsProgress));
    }

    public int getBottomInset() {
        return (int) (this.bottomInset * (1.0f - this.hideSystemVerticalInsetsProgress));
    }

    public void setCurrentPanTranslationY(float f) {
        this.currentPanTranslationY = f;
        this.container.invalidate();
    }

    public void setOverlayNavBarColor(int i) {
        this.overlayDrawNavBarColor = i;
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
        AndroidUtilities.setNavigationBarColor(getWindow(), this.overlayDrawNavBarColor);
        AndroidUtilities.setLightNavigationBar(getWindow(), ((double) AndroidUtilities.computePerceivedBrightness(this.overlayDrawNavBarColor)) > 0.721d);
    }

    public ViewGroup getContainerView() {
        return this.containerView;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    public void setOpenNoDelay(boolean z) {
        this.openNoDelay = z;
    }

    public int getBackgroundPaddingLeft() {
        return this.backgroundPaddingLeft;
    }
}
