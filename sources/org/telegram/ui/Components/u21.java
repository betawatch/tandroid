package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                w21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.h();
                w21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                w21 w21Var2 = this.b;
                w21Var2.H = max;
                w21Var2.h.invalidate();
                break;
        }
    }
}
