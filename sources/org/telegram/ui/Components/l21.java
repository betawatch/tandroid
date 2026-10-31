package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n21 b;

    public /* synthetic */ l21(n21 n21Var, int i10) {
        this.a = i10;
        this.b = n21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n21 n21Var = this.b;
                n21Var.U = floatValue;
                n21Var.h();
                n21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                n21 n21Var2 = this.b;
                n21Var2.L = max;
                n21Var2.h.invalidate();
                break;
        }
    }
}
