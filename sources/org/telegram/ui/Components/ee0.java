package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;

    public /* synthetic */ ee0(ge0 ge0Var, int i7) {
        this.a = i7;
        this.b = ge0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ge0 ge0Var = this.b;
                ge0Var.getClass();
                ge0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ge0Var.invalidate();
                break;
            default:
                ge0 ge0Var2 = this.b;
                ge0Var2.getClass();
                ge0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ge0Var2.invalidate();
                break;
        }
    }
}
