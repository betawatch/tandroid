package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
