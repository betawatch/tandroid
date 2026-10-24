package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ r3(z3 z3Var, int i10) {
        this.a = i10;
        this.b = z3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                z3Var.getClass();
                z3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.invalidate();
                break;
            case 1:
                z3 z3Var2 = this.b;
                z3Var2.getClass();
                z3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var2.invalidate();
                break;
            default:
                z3 z3Var3 = this.b;
                z3Var3.getClass();
                z3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
