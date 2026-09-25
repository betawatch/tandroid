package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ek0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ qk0 b;

    public ek0(qk0 qk0Var, float f7) {
        this.b = qk0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        qk0 qk0Var = this.b;
        qk0Var.o0 = floatValue;
        qk0Var.n0 = (1.0f - qk0Var.o0) * this.a;
        qk0Var.invalidate();
    }
}
