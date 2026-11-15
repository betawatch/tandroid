package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ d3(j3 j3Var, int i7) {
        this.a = i7;
        this.b = j3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j3 j3Var = this.b;
                j3Var.getClass();
                j3Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var.invalidate();
                break;
            case 1:
                j3 j3Var2 = this.b;
                j3Var2.getClass();
                j3Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                j3 j3Var3 = this.b;
                j3Var3.getClass();
                j3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var3.invalidate();
                break;
        }
    }
}
