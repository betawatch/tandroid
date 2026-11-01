package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ u2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var = this.b;
                w2Var.n = floatValue;
                w2Var.k.invalidate();
                if (w2Var.n > 1.0f && w2Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.i0.L(12), 0);
                    w2Var.r = ofInt;
                    ofInt.addUpdateListener(new u2(w2Var, 2));
                    w2Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    w2Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2 w2Var2 = this.b;
                w2Var2.m = intValue;
                w2Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2 w2Var3 = this.b;
                if (w2Var3.i <= w2Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                w2Var3.p = intValue2;
                w2Var3.k.invalidate();
                break;
        }
    }
}
