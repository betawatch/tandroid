package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ th0 b;

    public /* synthetic */ qh0(th0 th0Var, int i10) {
        this.a = i10;
        this.b = th0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                th0 th0Var = this.b;
                th0Var.getClass();
                th0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th0Var.c(true);
                break;
            default:
                th0 th0Var2 = this.b;
                th0Var2.getClass();
                th0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th0Var2.c(true);
                break;
        }
    }
}
