package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ek0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ qk0 b;

    public ek0(qk0 qk0Var, float f10) {
        this.b = qk0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        qk0 qk0Var = this.b;
        qk0Var.l0 = floatValue;
        qk0Var.k0 = (1.0f - qk0Var.l0) * this.a;
        qk0Var.invalidate();
    }
}
