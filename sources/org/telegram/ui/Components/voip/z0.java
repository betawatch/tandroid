package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;
import org.telegram.ui.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ b1 c;

    public z0(b1 b1Var, float f7, float f10) {
        this.c = b1Var;
        this.a = f7;
        this.b = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b1 b1Var = this.c;
        if (b1Var.P) {
            b1Var.M = false;
            b1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = b1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(b1Var.J, 0.0f);
        b1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(b1Var.e0);
        b1Var.d0.setDuration(300L);
        b1Var.d0.start();
        float measuredWidth = this.a - ((b1Var.getMeasuredWidth() - (b1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((b1Var.getMeasuredHeight() - (b1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        b1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        b1Var.setTranslationX(measuredWidth);
        b1Var.setTranslationY(measuredHeight);
        b1Var.setScaleX(0.23f);
        b1Var.setScaleY(0.23f);
        b1Var.animate().setListener(null).cancel();
        b1Var.animate().setListener(new s9(this, 26)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(gr.f).start();
        return false;
    }
}
