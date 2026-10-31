package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ ac0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                hf0 hf0Var = this.b;
                hf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hf0Var.c.setAlpha(floatValue);
                hf0Var.c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.i0.L(230.0f));
                break;
            case 1:
                hf0 hf0Var2 = this.b;
                hf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                hf0Var2.V.setScaleX(f7);
                hf0Var2.V.setScaleY(f7);
                hf0Var2.V.setAlpha(floatValue2);
                break;
            default:
                hf0 hf0Var3 = this.b;
                hf0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hf0Var3.c.setAlpha(floatValue3);
                hf0Var3.c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.i0.L(230.0f));
                break;
        }
    }
}
