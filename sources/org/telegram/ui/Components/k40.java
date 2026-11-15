package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q40 b;

    public /* synthetic */ k40(q40 q40Var, int i7) {
        this.a = i7;
        this.b = q40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q40 q40Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * q40Var.getMeasuredHeight() * 0.5f;
                q40Var.y0 = floatValue;
                q40Var.s.setTranslationY(floatValue + q40Var.x0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q40 q40Var2 = this.b;
                q40Var2.A0 = floatValue2;
                zi.v0 v0Var = q40Var2.P;
                if (v0Var != null) {
                    v0Var.y(floatValue2);
                    break;
                }
                break;
        }
    }
}
