package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class bj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ nj0 b;

    public bj0(nj0 nj0Var, float f7) {
        this.b = nj0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        nj0 nj0Var = this.b;
        nj0Var.o0 = floatValue;
        nj0Var.n0 = (1.0f - nj0Var.o0) * this.a;
        nj0Var.invalidate();
    }
}
