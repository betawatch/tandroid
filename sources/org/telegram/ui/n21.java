package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q21 b;

    public /* synthetic */ n21(q21 q21Var, int i10) {
        this.a = i10;
        this.b = q21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q21 q21Var = this.b;
                q21Var.N = floatValue;
                q21Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q21 q21Var2 = this.b;
                q21Var2.N = floatValue2;
                q21Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q21 q21Var3 = this.b;
                q21Var3.N = floatValue3;
                q21Var3.V.h0.invalidate();
                break;
        }
    }
}
