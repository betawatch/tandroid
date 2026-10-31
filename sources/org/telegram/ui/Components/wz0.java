package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz0 b;

    public /* synthetic */ wz0(xz0 xz0Var, int i10) {
        this.a = i10;
        this.b = xz0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xz0 xz0Var = this.b;
                xz0Var.getClass();
                xz0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var.invalidate();
                break;
            case 1:
                xz0 xz0Var2 = this.b;
                xz0Var2.getClass();
                xz0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var2.invalidate();
                break;
            case 2:
                xz0 xz0Var3 = this.b;
                xz0Var3.getClass();
                xz0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var3.invalidate();
                break;
            case 3:
                xz0 xz0Var4 = this.b;
                xz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var4.s = floatValue;
                xz0Var4.x = (int) ((xz0Var4.h * floatValue) + 0);
                xz0Var4.invalidate();
                break;
            default:
                xz0 xz0Var5 = this.b;
                xz0Var5.getClass();
                xz0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz0Var5.y = xz0Var5.r + ((int) Math.ceil((xz0Var5.n - r1) * r5));
                xz0Var5.invalidate();
                break;
        }
    }
}
