package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s21 b;

    public /* synthetic */ p21(s21 s21Var, int i10) {
        this.a = i10;
        this.b = s21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21 s21Var = this.b;
                s21Var.N = floatValue;
                s21Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21 s21Var2 = this.b;
                s21Var2.N = floatValue2;
                s21Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21 s21Var3 = this.b;
                s21Var3.N = floatValue3;
                s21Var3.V.h0.invalidate();
                break;
        }
    }
}
