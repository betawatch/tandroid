package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class n31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q31 b;

    public /* synthetic */ n31(q31 q31Var, int i10) {
        this.a = i10;
        this.b = q31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q31 q31Var = this.b;
                q31Var.getClass();
                q31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q31Var.h();
                q31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                q31 q31Var2 = this.b;
                q31Var2.K = max;
                q31Var2.h.invalidate();
                break;
        }
    }
}
