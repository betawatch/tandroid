package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
