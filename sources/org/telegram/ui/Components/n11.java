package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class n11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o11 b;

    public /* synthetic */ n11(o11 o11Var, int i10) {
        this.a = i10;
        this.b = o11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o11 o11Var = this.b;
                o11Var.getClass();
                o11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.invalidate();
                break;
            case 1:
                o11 o11Var2 = this.b;
                o11Var2.getClass();
                o11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var2.invalidate();
                break;
            case 2:
                o11 o11Var3 = this.b;
                o11Var3.getClass();
                o11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var3.invalidate();
                break;
            case 3:
                o11 o11Var4 = this.b;
                o11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var4.s = floatValue;
                o11Var4.w = (int) ((o11Var4.h * floatValue) + 0);
                o11Var4.invalidate();
                break;
            default:
                o11 o11Var5 = this.b;
                o11Var5.getClass();
                o11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var5.x = o11Var5.r + ((int) Math.ceil((o11Var5.n - r1) * r5));
                o11Var5.invalidate();
                break;
        }
    }
}
