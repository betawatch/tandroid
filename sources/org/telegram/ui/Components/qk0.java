package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class qk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ cl0 b;

    public qk0(cl0 cl0Var, float f7) {
        this.b = cl0Var;
        this.a = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cl0 cl0Var = this.b;
        cl0Var.o0 = floatValue;
        cl0Var.n0 = (1.0f - cl0Var.o0) * this.a;
        cl0Var.invalidate();
    }
}
