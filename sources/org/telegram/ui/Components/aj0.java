package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class aj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ mj0 b;

    public aj0(mj0 mj0Var, float f7) {
        this.b = mj0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mj0 mj0Var = this.b;
        mj0Var.o0 = floatValue;
        mj0Var.n0 = (1.0f - mj0Var.o0) * this.a;
        mj0Var.invalidate();
    }
}
