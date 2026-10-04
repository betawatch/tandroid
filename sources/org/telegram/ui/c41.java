package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class c41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ c41(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f41 f41Var = this.b;
                f41Var.getClass();
                f41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var.g();
                break;
            case 1:
                f41 f41Var2 = this.b;
                f41Var2.getClass();
                f41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var2.g();
                break;
            default:
                f41 f41Var3 = this.b;
                f41Var3.getClass();
                f41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var3.g();
                break;
        }
    }
}
