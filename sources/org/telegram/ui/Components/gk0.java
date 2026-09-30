package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class gk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ sk0 b;

    public gk0(sk0 sk0Var, float f7) {
        this.b = sk0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sk0 sk0Var = this.b;
        sk0Var.o0 = floatValue;
        sk0Var.n0 = (1.0f - sk0Var.o0) * this.a;
        sk0Var.invalidate();
    }
}
