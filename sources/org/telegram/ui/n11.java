package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i31 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ n11(i31 i31Var, boolean z10, int i10) {
        this.a = i10;
        this.b = i31Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i31 i31Var = this.b;
                g21 g21Var = i31Var.h0;
                v11 v11Var = i31Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                g21Var.setAlpha(f7);
                g21Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * floatValue);
                v11Var.setAlpha(floatValue);
                v11Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * f7);
                i31Var.j0.setAlpha(v11Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                i31 i31Var2 = this.b;
                i31Var2.j0.setAlpha(i31Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
