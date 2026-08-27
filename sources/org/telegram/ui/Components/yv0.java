package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ yv0(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bw0 bw0Var = this.b;
                bw0Var.getClass();
                bw0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.invalidate();
                break;
            case 1:
                bw0 bw0Var2 = this.b;
                bw0Var2.getClass();
                bw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                bw0 bw0Var3 = this.b;
                bw0Var3.getClass();
                bw0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var3.invalidate();
                break;
        }
    }
}
