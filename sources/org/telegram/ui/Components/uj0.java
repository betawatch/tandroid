package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class uj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ gk0 b;

    public uj0(gk0 gk0Var, float f7) {
        this.b = gk0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gk0 gk0Var = this.b;
        gk0Var.o0 = floatValue;
        gk0Var.n0 = (1.0f - gk0Var.o0) * this.a;
        gk0Var.invalidate();
    }
}
