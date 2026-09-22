package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class c11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d11 b;

    public /* synthetic */ c11(d11 d11Var, int i10) {
        this.a = i10;
        this.b = d11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d11 d11Var = this.b;
                d11Var.getClass();
                d11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var.invalidate();
                break;
            case 1:
                d11 d11Var2 = this.b;
                d11Var2.getClass();
                d11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var2.invalidate();
                break;
            case 2:
                d11 d11Var3 = this.b;
                d11Var3.getClass();
                d11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var3.invalidate();
                break;
            case 3:
                d11 d11Var4 = this.b;
                d11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var4.s = floatValue;
                d11Var4.w = (int) ((d11Var4.h * floatValue) + 0);
                d11Var4.invalidate();
                break;
            default:
                d11 d11Var5 = this.b;
                d11Var5.getClass();
                d11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d11Var5.x = d11Var5.r + ((int) Math.ceil((d11Var5.n - r1) * r5));
                d11Var5.invalidate();
                break;
        }
    }
}
