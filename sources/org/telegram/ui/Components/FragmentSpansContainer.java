package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* loaded from: classes5.dex */
public class FragmentSpansContainer extends ScrollView {
    public final ArrayList allSpans;
    private final int currentAccount;
    private Delegate delegate;
    private int fieldY;
    private boolean ignoreScrollEvent;
    public final LongSparseArray selectedContacts;
    private final SpansContainer spansContainer;
    private int visualHeight;

    public interface Delegate {
        void onAfterMeasure(int i);
    }

    public FragmentSpansContainer(Context context, int i) {
        super(context);
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList();
        this.currentAccount = i;
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        setVerticalScrollBarEnabled(false);
        addView(spansContainer, LayoutHelper.createFrame(-1, -2.0f));
    }

    public ViewGroup getSpansContainer() {
        return this.spansContainer;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f = this.visualHeight;
        float y = motionEvent.getY();
        if (action != 0 || y <= f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.ignoreScrollEvent) {
            this.ignoreScrollEvent = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top += this.fieldY + AndroidUtilities.dp(20.0f);
        rect.bottom += this.fieldY + AndroidUtilities.dp(50.0f);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void addSpan(GroupCreateSpan groupCreateSpan) {
        this.spansContainer.addSpan(groupCreateSpan);
    }

    public void endAnimation() {
        this.spansContainer.endAnimation();
    }

    public void removeSpan(GroupCreateSpan groupCreateSpan) {
        this.spansContainer.removeSpan(groupCreateSpan);
    }

    public void removeAllSpans(boolean z) {
        this.spansContainer.removeAllSpans(z);
    }

    private class SpansContainer extends ViewGroup {
        private View addingSpan;
        private int animationIndex;
        private boolean animationStarted;
        private final ArrayList animators;
        private int containerHeight;
        private AnimatorSet currentAnimation;
        private int maxTy;
        private final ArrayList removingSpans;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList();
            this.removingSpans = new ArrayList();
            this.animationIndex = -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int min;
            char c;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int dp = size - AndroidUtilities.dp(26.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            if (!this.animationStarted) {
                this.maxTy = 0;
            }
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                    boolean contains = this.removingSpans.contains(childAt);
                    if (!contains && childAt.getMeasuredWidth() + i3 > dp) {
                        dp2 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        i3 = 0;
                    }
                    if (childAt.getMeasuredWidth() + i4 > dp) {
                        dp3 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        i4 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(13.0f) + i3;
                    if (!this.animationStarted) {
                        if (contains) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i4);
                            childAt.setTranslationY(dp3);
                        } else {
                            if (!this.removingSpans.isEmpty()) {
                                float f = dp4;
                                if (childAt.getTranslationX() != f) {
                                    c = 0;
                                    this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                                } else {
                                    c = 0;
                                }
                                float f2 = dp2;
                                if (childAt.getTranslationY() != f2) {
                                    ArrayList arrayList = this.animators;
                                    Property property = View.TRANSLATION_Y;
                                    float[] fArr = new float[1];
                                    fArr[c] = f2;
                                    arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                                }
                                this.maxTy = Math.max(this.maxTy, dp2);
                            } else {
                                childAt.setTranslationX(dp4);
                                childAt.setTranslationY(dp2);
                                this.maxTy = Math.max(this.maxTy, dp2);
                            }
                            if (!contains) {
                                i3 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                            }
                            i4 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                        }
                    }
                    if (!contains) {
                    }
                    i4 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                }
            }
            if (AndroidUtilities.isTablet()) {
                min = AndroidUtilities.dp(372.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                min = (Math.min(point.x, point.y) - AndroidUtilities.dp(158.0f)) / 3;
            }
            if (dp - i3 < min) {
                dp2 += AndroidUtilities.dp(40.0f);
            }
            if (dp - i4 < min) {
                dp3 += AndroidUtilities.dp(40.0f);
            }
            if (!this.animationStarted) {
                int dp5 = dp3 + AndroidUtilities.dp(42.0f);
                FragmentSpansContainer.this.fieldY = dp2;
                if (this.currentAnimation != null) {
                    this.containerHeight = dp2 + AndroidUtilities.dp(42.0f);
                    this.currentAnimation.playTogether(this.animators);
                    this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.FragmentSpansContainer.SpansContainer.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            NotificationCenter.getInstance(FragmentSpansContainer.this.currentAccount).onAnimationFinish(SpansContainer.this.animationIndex);
                            SpansContainer.this.requestLayout();
                        }
                    });
                    this.animationIndex = NotificationCenter.getInstance(FragmentSpansContainer.this.currentAccount).setAnimationInProgress(this.animationIndex, null);
                    this.currentAnimation.start();
                    this.animationStarted = true;
                } else {
                    this.containerHeight = dp5;
                }
            }
            FragmentSpansContainer fragmentSpansContainer = FragmentSpansContainer.this;
            int i6 = this.maxTy;
            fragmentSpansContainer.visualHeight = i6 > 0 ? i6 + AndroidUtilities.dp(40.0f) : 0;
            setMeasuredDimension(size, this.containerHeight);
            if (FragmentSpansContainer.this.delegate != null) {
                FragmentSpansContainer.this.delegate.onAfterMeasure(FragmentSpansContainer.this.visualHeight);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        public void addSpan(GroupCreateSpan groupCreateSpan) {
            FragmentSpansContainer.this.allSpans.add(groupCreateSpan);
            if (!groupCreateSpan.isFlag) {
                FragmentSpansContainer.this.selectedContacts.put(groupCreateSpan.getUid(), groupCreateSpan);
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.FragmentSpansContainer.SpansContainer.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.addingSpan = null;
                    SpansContainer.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                }
            });
            this.currentAnimation.setDuration(150L);
            this.addingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.SCALE_X, 0.01f, 1.0f));
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.SCALE_Y, 0.01f, 1.0f));
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            addView(groupCreateSpan);
        }

        public void endAnimation() {
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet == null || !animatorSet.isRunning()) {
                return;
            }
            this.currentAnimation.setupEndValues();
            this.currentAnimation.cancel();
        }

        public void removeSpan(final GroupCreateSpan groupCreateSpan) {
            FragmentSpansContainer.this.ignoreScrollEvent = true;
            if (!groupCreateSpan.isFlag) {
                FragmentSpansContainer.this.selectedContacts.remove(groupCreateSpan.getUid());
            }
            FragmentSpansContainer.this.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.FragmentSpansContainer.SpansContainer.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.removeView(groupCreateSpan);
                    SpansContainer.this.removingSpans.clear();
                    SpansContainer.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                }
            });
            this.currentAnimation.setDuration(150L);
            this.removingSpans.clear();
            this.removingSpans.add(groupCreateSpan);
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }

        public void removeAllSpans(boolean z) {
            FragmentSpansContainer.this.ignoreScrollEvent = true;
            final ArrayList arrayList = new ArrayList(FragmentSpansContainer.this.allSpans);
            FragmentSpansContainer.this.allSpans.clear();
            this.removingSpans.clear();
            this.removingSpans.addAll(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                ((GroupCreateSpan) arrayList.get(i)).setOnClickListener(null);
            }
            endAnimation();
            if (z) {
                this.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.FragmentSpansContainer.SpansContainer.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            SpansContainer.this.removeView((View) arrayList.get(i2));
                        }
                        SpansContainer.this.removingSpans.clear();
                        SpansContainer.this.currentAnimation = null;
                        SpansContainer.this.animationStarted = false;
                    }
                });
                this.animators.clear();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList.get(i2);
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
                }
            } else {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    removeView((View) arrayList.get(i3));
                }
                this.removingSpans.clear();
                this.currentAnimation = null;
                this.animationStarted = false;
            }
            requestLayout();
        }
    }
}
