package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ fk0 b;

    public tj0(fk0 fk0Var, float f7) {
        this.b = fk0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fk0 fk0Var = this.b;
        fk0Var.o0 = floatValue;
        fk0Var.n0 = (1.0f - fk0Var.o0) * this.a;
        fk0Var.invalidate();
    }
}
