package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d50 b;

    public /* synthetic */ y40(d50 d50Var, int i10) {
        this.a = i10;
        this.b = d50Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d50 d50Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * d50Var.getMeasuredHeight() * 0.5f;
                d50Var.w0 = floatValue;
                d50Var.s.setTranslationY(floatValue + d50Var.v0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d50 d50Var2 = this.b;
                d50Var2.y0 = floatValue2;
                li.x0 x0Var = d50Var2.O;
                if (x0Var != null) {
                    x0Var.x(floatValue2);
                    break;
                }
                break;
        }
    }
}
