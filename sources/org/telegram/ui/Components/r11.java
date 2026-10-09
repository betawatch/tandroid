package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s11 b;

    public /* synthetic */ r11(s11 s11Var, int i10) {
        this.a = i10;
        this.b = s11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s11 s11Var = this.b;
                s11Var.getClass();
                s11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var.invalidate();
                break;
            case 1:
                s11 s11Var2 = this.b;
                s11Var2.getClass();
                s11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var2.invalidate();
                break;
            case 2:
                s11 s11Var3 = this.b;
                s11Var3.getClass();
                s11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var3.invalidate();
                break;
            case 3:
                s11 s11Var4 = this.b;
                s11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var4.s = floatValue;
                s11Var4.w = (int) ((s11Var4.h * floatValue) + 0);
                s11Var4.invalidate();
                break;
            default:
                s11 s11Var5 = this.b;
                s11Var5.getClass();
                s11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var5.x = s11Var5.r + ((int) Math.ceil((s11Var5.n - r1) * r5));
                s11Var5.invalidate();
                break;
        }
    }
}
