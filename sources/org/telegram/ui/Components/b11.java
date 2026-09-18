package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c11 b;

    public /* synthetic */ b11(c11 c11Var, int i10) {
        this.a = i10;
        this.b = c11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c11 c11Var = this.b;
                c11Var.getClass();
                c11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var.invalidate();
                break;
            case 1:
                c11 c11Var2 = this.b;
                c11Var2.getClass();
                c11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var2.invalidate();
                break;
            case 2:
                c11 c11Var3 = this.b;
                c11Var3.getClass();
                c11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var3.invalidate();
                break;
            case 3:
                c11 c11Var4 = this.b;
                c11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var4.s = floatValue;
                c11Var4.w = (int) ((c11Var4.h * floatValue) + 0);
                c11Var4.invalidate();
                break;
            default:
                c11 c11Var5 = this.b;
                c11Var5.getClass();
                c11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var5.x = c11Var5.r + ((int) Math.ceil((c11Var5.n - r1) * r5));
                c11Var5.invalidate();
                break;
        }
    }
}
