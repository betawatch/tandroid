package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
import org.telegram.ui.va;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ n1 c;

    public l1(n1 n1Var, float f10, float f11) {
        this.c = n1Var;
        this.a = f10;
        this.b = f11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        n1 n1Var = this.c;
        if (n1Var.P) {
            n1Var.M = false;
            n1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = n1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.J, 0.0f);
        n1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(n1Var.e0);
        n1Var.d0.setDuration(300L);
        n1Var.d0.start();
        float measuredWidth = this.a - ((n1Var.getMeasuredWidth() - (n1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((n1Var.getMeasuredHeight() - (n1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        n1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        n1Var.setTranslationX(measuredWidth);
        n1Var.setTranslationY(measuredHeight);
        n1Var.setScaleX(0.23f);
        n1Var.setScaleY(0.23f);
        n1Var.animate().setListener(null).cancel();
        n1Var.animate().setListener(new va(this, 15)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(xq.f).start();
        return false;
    }
}
