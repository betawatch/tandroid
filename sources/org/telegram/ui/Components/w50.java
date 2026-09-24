package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b60 b;

    public /* synthetic */ w50(b60 b60Var, int i10) {
        this.a = i10;
        this.b = b60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b60 b60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b60Var.getMeasuredHeight() * 0.5f;
                b60Var.m0 = floatValue;
                b60Var.v.setTranslationY(floatValue + b60Var.l0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b60 b60Var2 = this.b;
                b60Var2.o0 = floatValue2;
                ki.r0 r0Var = b60Var2.M;
                if (r0Var != null) {
                    r0Var.v(floatValue2);
                    break;
                }
                break;
        }
    }
}
