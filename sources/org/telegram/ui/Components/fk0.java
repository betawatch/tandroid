package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ rk0 b;

    public fk0(rk0 rk0Var, float f10) {
        this.b = rk0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        rk0 rk0Var = this.b;
        rk0Var.l0 = floatValue;
        rk0Var.k0 = (1.0f - rk0Var.l0) * this.a;
        rk0Var.invalidate();
    }
}
