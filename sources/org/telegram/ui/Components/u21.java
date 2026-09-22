package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w21 b;

    public /* synthetic */ u21(w21 w21Var, int i10) {
        this.a = i10;
        this.b = w21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w21 w21Var = this.b;
                w21Var.getClass();
                w21Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.h();
                w21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                w21 w21Var2 = this.b;
                w21Var2.K = max;
                w21Var2.h.invalidate();
                break;
        }
    }
}
