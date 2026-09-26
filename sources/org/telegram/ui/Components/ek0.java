package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
