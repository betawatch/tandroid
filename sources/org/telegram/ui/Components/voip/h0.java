package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.a30;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ h0(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.getClass();
                l0Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.c = floatValue;
                c40 c40Var = l0Var2.k0;
                c40Var.y3.setAlpha(1.0f - floatValue);
                a30 a30Var = c40Var.J1;
                a30Var.setAlpha((1.0f - c40Var.Z3.c) * (a30Var.getTag() != null ? 1.0f : 0.0f));
                c40Var.J1(c40Var.t2);
                l0Var2.l();
                break;
        }
    }
}
