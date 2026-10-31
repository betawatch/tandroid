package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r41 implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ w41 c;

    public r41(w41 w41Var, int i10) {
        this.c = w41Var;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        w41 w41Var = this.c;
        w41Var.N = true;
        w41Var.n.scrollBy(0, floatValue - this.a);
        w41Var.N = false;
        this.a = floatValue;
    }
}
