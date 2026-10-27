package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y11 b;

    public /* synthetic */ x11(y11 y11Var, int i10) {
        this.a = i10;
        this.b = y11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y11 y11Var = this.b;
                y11Var.getClass();
                y11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.invalidate();
                break;
            case 1:
                y11 y11Var2 = this.b;
                y11Var2.getClass();
                y11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var2.invalidate();
                break;
            case 2:
                y11 y11Var3 = this.b;
                y11Var3.getClass();
                y11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var3.invalidate();
                break;
            case 3:
                y11 y11Var4 = this.b;
                y11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var4.s = floatValue;
                y11Var4.w = (int) ((y11Var4.h * floatValue) + 0);
                y11Var4.invalidate();
                break;
            default:
                y11 y11Var5 = this.b;
                y11Var5.getClass();
                y11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var5.x = y11Var5.r + ((int) Math.ceil((y11Var5.n - r1) * r5));
                y11Var5.invalidate();
                break;
        }
    }
}
