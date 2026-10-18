package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ cl0 b;

    public qk0(cl0 cl0Var, float f7) {
        this.b = cl0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cl0 cl0Var = this.b;
        cl0Var.o0 = floatValue;
        cl0Var.n0 = (1.0f - cl0Var.o0) * this.a;
        cl0Var.invalidate();
    }
}
