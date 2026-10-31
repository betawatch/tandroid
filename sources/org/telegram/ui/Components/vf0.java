package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf0 b;

    public /* synthetic */ vf0(yf0 yf0Var, int i10) {
        this.a = i10;
        this.b = yf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yf0 yf0Var = this.b;
                yf0Var.getClass();
                yf0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yf0Var.c(true);
                break;
            default:
                yf0 yf0Var2 = this.b;
                yf0Var2.getClass();
                yf0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yf0Var2.c(true);
                break;
        }
    }
}
