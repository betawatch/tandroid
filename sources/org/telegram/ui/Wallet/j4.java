package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ j4(w5 w5Var, int i7) {
        this.a = i7;
        this.b = w5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w5 w5Var = this.b;
                w5Var.getClass();
                w5Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                w5 w5Var2 = this.b;
                w5Var2.getClass();
                w5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var2.T0();
                break;
        }
    }
}
