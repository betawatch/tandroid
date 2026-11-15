package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ k4(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y5 y5Var = this.b;
                y5Var.getClass();
                y5Var.N0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                y5 y5Var2 = this.b;
                y5Var2.getClass();
                y5Var2.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var2.U0();
                break;
        }
    }
}
