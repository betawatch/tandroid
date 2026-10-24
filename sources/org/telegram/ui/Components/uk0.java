package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class uk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ gl0 b;

    public uk0(gl0 gl0Var, float f7) {
        this.b = gl0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gl0 gl0Var = this.b;
        gl0Var.o0 = floatValue;
        gl0Var.n0 = (1.0f - gl0Var.o0) * this.a;
        gl0Var.invalidate();
    }
}
