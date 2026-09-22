package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q61 b;

    public /* synthetic */ n61(q61 q61Var, int i10) {
        this.a = i10;
        this.b = q61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61 q61Var = this.b;
                q61Var.N = floatValue;
                q61Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61 q61Var2 = this.b;
                q61Var2.N = floatValue2;
                q61Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61 q61Var3 = this.b;
                q61Var3.N = floatValue3;
                q61Var3.V.h0.invalidate();
                break;
        }
    }
}
