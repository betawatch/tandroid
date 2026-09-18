package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o01 b;

    public /* synthetic */ n01(o01 o01Var, int i10) {
        this.a = i10;
        this.b = o01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o01 o01Var = this.b;
                o01Var.getClass();
                o01Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var.invalidate();
                break;
            case 1:
                o01 o01Var2 = this.b;
                o01Var2.getClass();
                o01Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var2.invalidate();
                break;
            case 2:
                o01 o01Var3 = this.b;
                o01Var3.getClass();
                o01Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var3.invalidate();
                break;
            case 3:
                o01 o01Var4 = this.b;
                o01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var4.s = floatValue;
                o01Var4.w = (int) ((o01Var4.h * floatValue) + 0);
                o01Var4.invalidate();
                break;
            default:
                o01 o01Var5 = this.b;
                o01Var5.getClass();
                o01Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o01Var5.x = o01Var5.r + ((int) Math.ceil((o01Var5.n - r1) * r5));
                o01Var5.invalidate();
                break;
        }
    }
}
