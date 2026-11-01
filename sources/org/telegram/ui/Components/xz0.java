package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;

    public /* synthetic */ xz0(yz0 yz0Var, int i10) {
        this.a = i10;
        this.b = yz0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yz0 yz0Var = this.b;
                yz0Var.getClass();
                yz0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var.invalidate();
                break;
            case 1:
                yz0 yz0Var2 = this.b;
                yz0Var2.getClass();
                yz0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var2.invalidate();
                break;
            case 2:
                yz0 yz0Var3 = this.b;
                yz0Var3.getClass();
                yz0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var3.invalidate();
                break;
            case 3:
                yz0 yz0Var4 = this.b;
                yz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var4.s = floatValue;
                yz0Var4.x = (int) ((yz0Var4.h * floatValue) + 0);
                yz0Var4.invalidate();
                break;
            default:
                yz0 yz0Var5 = this.b;
                yz0Var5.getClass();
                yz0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var5.y = yz0Var5.r + ((int) Math.ceil((yz0Var5.n - r1) * r5));
                yz0Var5.invalidate();
                break;
        }
    }
}
