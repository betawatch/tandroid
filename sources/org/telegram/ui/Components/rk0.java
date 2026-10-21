package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class rk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ dl0 b;

    public rk0(dl0 dl0Var, float f7) {
        this.b = dl0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dl0 dl0Var = this.b;
        dl0Var.o0 = floatValue;
        dl0Var.n0 = (1.0f - dl0Var.o0) * this.a;
        dl0Var.invalidate();
    }
}
