package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty0 b;

    public /* synthetic */ sy0(ty0 ty0Var, int i7) {
        this.a = i7;
        this.b = ty0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ty0 ty0Var = this.b;
                ty0Var.getClass();
                ty0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var.invalidate();
                break;
            case 1:
                ty0 ty0Var2 = this.b;
                ty0Var2.getClass();
                ty0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var2.invalidate();
                break;
            case 2:
                ty0 ty0Var3 = this.b;
                ty0Var3.getClass();
                ty0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var3.invalidate();
                break;
            case 3:
                ty0 ty0Var4 = this.b;
                ty0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var4.s = floatValue;
                ty0Var4.x = (int) ((ty0Var4.h * floatValue) + 0);
                ty0Var4.invalidate();
                break;
            default:
                ty0 ty0Var5 = this.b;
                ty0Var5.getClass();
                ty0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var5.y = ty0Var5.r + ((int) Math.ceil((ty0Var5.n - r1) * r5));
                ty0Var5.invalidate();
                break;
        }
    }
}
