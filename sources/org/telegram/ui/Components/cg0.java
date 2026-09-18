package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ cg0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                eg0Var.getClass();
                eg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.invalidate();
                break;
            default:
                eg0 eg0Var2 = this.b;
                eg0Var2.getClass();
                eg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var2.invalidate();
                break;
        }
    }
}
