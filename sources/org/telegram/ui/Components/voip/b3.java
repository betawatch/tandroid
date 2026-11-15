package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ b3(e3 e3Var, int i7) {
        this.a = i7;
        this.b = e3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                e3Var.getClass();
                e3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.invalidate();
                break;
            case 1:
                e3 e3Var2 = this.b;
                e3Var2.getClass();
                e3Var2.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var2.invalidate();
                break;
            case 2:
                e3 e3Var3 = this.b;
                e3Var3.getClass();
                e3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var3.invalidate();
                break;
            default:
                e3 e3Var4 = this.b;
                e3Var4.getClass();
                e3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var4.invalidate();
                break;
        }
    }
}
