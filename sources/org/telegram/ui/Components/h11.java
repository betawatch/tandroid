package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k11 b;

    public /* synthetic */ h11(k11 k11Var, int i7) {
        this.a = i7;
        this.b = k11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fi.w2 w2Var = this.b.f;
                w2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                w2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                w2Var.invalidate();
                break;
            default:
                k11 k11Var = this.b;
                k11Var.getClass();
                k11Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var.h();
                break;
        }
    }
}
