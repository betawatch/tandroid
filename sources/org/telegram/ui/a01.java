package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t11 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a01(t11 t11Var, boolean z9, int i7) {
        this.a = i7;
        this.b = t11Var;
        this.c = z9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t11 t11Var = this.b;
                r01 r01Var = t11Var.h0;
                h01 h01Var = t11Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                r01Var.setAlpha(f10);
                r01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                h01Var.setAlpha(floatValue);
                h01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                t11Var.j0.setAlpha(h01Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                t11 t11Var2 = this.b;
                t11Var2.j0.setAlpha(t11Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
