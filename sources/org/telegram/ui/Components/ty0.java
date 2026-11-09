package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ty0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy0 b;

    public /* synthetic */ ty0(uy0 uy0Var, int i7) {
        this.a = i7;
        this.b = uy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uy0 uy0Var = this.b;
                uy0Var.getClass();
                uy0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var.invalidate();
                break;
            case 1:
                uy0 uy0Var2 = this.b;
                uy0Var2.getClass();
                uy0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var2.invalidate();
                break;
            case 2:
                uy0 uy0Var3 = this.b;
                uy0Var3.getClass();
                uy0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var3.invalidate();
                break;
            case 3:
                uy0 uy0Var4 = this.b;
                uy0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var4.s = floatValue;
                uy0Var4.x = (int) ((uy0Var4.h * floatValue) + 0);
                uy0Var4.invalidate();
                break;
            default:
                uy0 uy0Var5 = this.b;
                uy0Var5.getClass();
                uy0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var5.y = uy0Var5.r + ((int) Math.ceil((uy0Var5.n - r1) * r5));
                uy0Var5.invalidate();
                break;
        }
    }
}
