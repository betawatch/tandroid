package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t31 b;

    public /* synthetic */ q31(t31 t31Var, int i10) {
        this.a = i10;
        this.b = t31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t31 t31Var = this.b;
                t31Var.getClass();
                t31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t31Var.g();
                break;
            case 1:
                t31 t31Var2 = this.b;
                t31Var2.getClass();
                t31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t31Var2.g();
                break;
            default:
                t31 t31Var3 = this.b;
                t31Var3.getClass();
                t31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t31Var3.g();
                break;
        }
    }
}
