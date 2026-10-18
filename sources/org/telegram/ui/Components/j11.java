package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k11 b;

    public /* synthetic */ j11(k11 k11Var, int i10) {
        this.a = i10;
        this.b = k11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k11 k11Var = this.b;
                k11Var.getClass();
                k11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var.invalidate();
                break;
            case 1:
                k11 k11Var2 = this.b;
                k11Var2.getClass();
                k11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var2.invalidate();
                break;
            case 2:
                k11 k11Var3 = this.b;
                k11Var3.getClass();
                k11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var3.invalidate();
                break;
            case 3:
                k11 k11Var4 = this.b;
                k11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var4.s = floatValue;
                k11Var4.w = (int) ((k11Var4.h * floatValue) + 0);
                k11Var4.invalidate();
                break;
            default:
                k11 k11Var5 = this.b;
                k11Var5.getClass();
                k11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k11Var5.x = k11Var5.r + ((int) Math.ceil((k11Var5.n - r1) * r5));
                k11Var5.invalidate();
                break;
        }
    }
}
