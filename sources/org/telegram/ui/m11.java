package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g31 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ m11(g31 g31Var, boolean z10, int i10) {
        this.a = i10;
        this.b = g31Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g31 g31Var = this.b;
                e21 e21Var = g31Var.h0;
                t11 t11Var = g31Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                e21Var.setAlpha(f7);
                e21Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * floatValue);
                t11Var.setAlpha(floatValue);
                t11Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * f7);
                g31Var.j0.setAlpha(t11Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                g31 g31Var2 = this.b;
                g31Var2.j0.setAlpha(g31Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
