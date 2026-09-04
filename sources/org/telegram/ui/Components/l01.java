package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m01 b;

    public /* synthetic */ l01(m01 m01Var, int i10) {
        this.a = i10;
        this.b = m01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m01 m01Var = this.b;
                m01Var.getClass();
                m01Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var.invalidate();
                break;
            case 1:
                m01 m01Var2 = this.b;
                m01Var2.getClass();
                m01Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var2.invalidate();
                break;
            case 2:
                m01 m01Var3 = this.b;
                m01Var3.getClass();
                m01Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var3.invalidate();
                break;
            case 3:
                m01 m01Var4 = this.b;
                m01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var4.s = floatValue;
                m01Var4.w = (int) ((m01Var4.h * floatValue) + 0);
                m01Var4.invalidate();
                break;
            default:
                m01 m01Var5 = this.b;
                m01Var5.getClass();
                m01Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var5.x = m01Var5.r + ((int) Math.ceil((m01Var5.n - r1) * r5));
                m01Var5.invalidate();
                break;
        }
    }
}
