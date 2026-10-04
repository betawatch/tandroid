package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l11 b;

    public /* synthetic */ k11(l11 l11Var, int i10) {
        this.a = i10;
        this.b = l11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l11 l11Var = this.b;
                l11Var.getClass();
                l11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var.invalidate();
                break;
            case 1:
                l11 l11Var2 = this.b;
                l11Var2.getClass();
                l11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var2.invalidate();
                break;
            case 2:
                l11 l11Var3 = this.b;
                l11Var3.getClass();
                l11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var3.invalidate();
                break;
            case 3:
                l11 l11Var4 = this.b;
                l11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var4.s = floatValue;
                l11Var4.w = (int) ((l11Var4.h * floatValue) + 0);
                l11Var4.invalidate();
                break;
            default:
                l11 l11Var5 = this.b;
                l11Var5.getClass();
                l11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var5.x = l11Var5.r + ((int) Math.ceil((l11Var5.n - r1) * r5));
                l11Var5.invalidate();
                break;
        }
    }
}
