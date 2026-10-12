package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t31 b;

    public /* synthetic */ r31(t31 t31Var, int i10) {
        this.a = i10;
        this.b = t31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bi.d4 d4Var = this.b.f;
                d4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                d4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                d4Var.invalidate();
                break;
            default:
                t31 t31Var = this.b;
                t31Var.getClass();
                t31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t31Var.h();
                break;
        }
    }
}
