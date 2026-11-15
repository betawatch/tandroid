package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ u2(v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                v2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var.d = intValue;
                v2Var.e = intValue;
                v2Var.f = intValue;
                v2Var.h = intValue;
                v2Var.n = intValue;
                v2Var.invalidate();
                break;
            default:
                v2 v2Var2 = this.b;
                v2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.d = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(56.0f));
                v2Var2.e = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(36.0f));
                v2Var2.f = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(60.0f));
                v2Var2.h = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(36.0f));
                v2Var2.n = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(64.0f));
                v2Var2.r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                v2Var2.s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                v2Var2.w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                v2Var2.x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                v2Var2.y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                v2Var2.invalidate();
                break;
        }
    }
}
