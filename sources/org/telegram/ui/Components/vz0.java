package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz0 b;

    public /* synthetic */ vz0(wz0 wz0Var, int i10) {
        this.a = i10;
        this.b = wz0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wz0 wz0Var = this.b;
                wz0Var.getClass();
                wz0Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var.invalidate();
                break;
            case 1:
                wz0 wz0Var2 = this.b;
                wz0Var2.getClass();
                wz0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var2.invalidate();
                break;
            case 2:
                wz0 wz0Var3 = this.b;
                wz0Var3.getClass();
                wz0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var3.invalidate();
                break;
            case 3:
                wz0 wz0Var4 = this.b;
                wz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var4.s = floatValue;
                wz0Var4.w = (int) ((wz0Var4.h * floatValue) + 0);
                wz0Var4.invalidate();
                break;
            default:
                wz0 wz0Var5 = this.b;
                wz0Var5.getClass();
                wz0Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz0Var5.x = wz0Var5.r + ((int) Math.ceil((wz0Var5.n - r1) * r5));
                wz0Var5.invalidate();
                break;
        }
    }
}
