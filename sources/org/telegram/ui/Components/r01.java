package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s01 b;

    public /* synthetic */ r01(s01 s01Var, int i10) {
        this.a = i10;
        this.b = s01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s01 s01Var = this.b;
                s01Var.getClass();
                s01Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var.invalidate();
                break;
            case 1:
                s01 s01Var2 = this.b;
                s01Var2.getClass();
                s01Var2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var2.invalidate();
                break;
            case 2:
                s01 s01Var3 = this.b;
                s01Var3.getClass();
                s01Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var3.invalidate();
                break;
            case 3:
                s01 s01Var4 = this.b;
                s01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var4.s = floatValue;
                s01Var4.w = (int) ((s01Var4.h * floatValue) + 0);
                s01Var4.invalidate();
                break;
            default:
                s01 s01Var5 = this.b;
                s01Var5.getClass();
                s01Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01Var5.x = s01Var5.r + ((int) Math.ceil((s01Var5.n - r1) * r5));
                s01Var5.invalidate();
                break;
        }
    }
}
