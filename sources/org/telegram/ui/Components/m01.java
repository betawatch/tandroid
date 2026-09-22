package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n01 b;

    public /* synthetic */ m01(n01 n01Var, int i10) {
        this.a = i10;
        this.b = n01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n01 n01Var = this.b;
                n01Var.getClass();
                n01Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var.invalidate();
                break;
            case 1:
                n01 n01Var2 = this.b;
                n01Var2.getClass();
                n01Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var2.invalidate();
                break;
            case 2:
                n01 n01Var3 = this.b;
                n01Var3.getClass();
                n01Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var3.invalidate();
                break;
            case 3:
                n01 n01Var4 = this.b;
                n01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var4.s = floatValue;
                n01Var4.w = (int) ((n01Var4.h * floatValue) + 0);
                n01Var4.invalidate();
                break;
            default:
                n01 n01Var5 = this.b;
                n01Var5.getClass();
                n01Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n01Var5.x = n01Var5.r + ((int) Math.ceil((n01Var5.n - r1) * r5));
                n01Var5.invalidate();
                break;
        }
    }
}
