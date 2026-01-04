package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;

/* loaded from: classes4.dex */
public class RecyclerListViewScroller {
    int lastScrolled;
    final RecyclerListView recyclerListView;
    ValueAnimator valueAnimator;

    public RecyclerListViewScroller(RecyclerListView recyclerListView) {
        this.recyclerListView = recyclerListView;
    }

    public void smoothScrollBy(int i) {
        smoothScrollBy(i, 200L, CubicBezierInterpolator.DEFAULT);
    }

    public void smoothScrollBy(final int i, long j, Interpolator interpolator) {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.valueAnimator.cancel();
        }
        final int[] iArr = new int[1];
        this.lastScrolled = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        this.valueAnimator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.RecyclerListViewScroller$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                RecyclerListViewScroller.this.lambda$smoothScrollBy$0(iArr, valueAnimator2);
            }
        });
        this.valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.RecyclerListViewScroller.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                RecyclerListViewScroller.this.recyclerListView.scrollBy(0, i - iArr[0]);
                RecyclerListViewScroller.this.valueAnimator = null;
            }
        });
        this.valueAnimator.setDuration(j);
        this.valueAnimator.setInterpolator(interpolator);
        this.valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$smoothScrollBy$0(int[] iArr, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = intValue - this.lastScrolled;
        this.recyclerListView.scrollBy(0, i);
        iArr[0] = iArr[0] + i;
        this.lastScrolled = intValue;
    }

    public void cancel() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.valueAnimator.cancel();
            this.valueAnimator = null;
        }
    }

    public boolean isRunning() {
        return this.valueAnimator != null;
    }
}
