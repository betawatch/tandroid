package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ nz0(g11 g11Var, boolean z10, int i3) {
        this.a = i3;
        this.b = g11Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g11 g11Var = this.b;
                e01 e01Var = g11Var.i0;
                uz0 uz0Var = g11Var.j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                e01Var.setAlpha(f10);
                e01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                uz0Var.setAlpha(floatValue);
                uz0Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                g11Var.k0.setAlpha(uz0Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                g11 g11Var2 = this.b;
                g11Var2.k0.setAlpha(g11Var2.j0.getAlpha() * floatValue2);
                break;
        }
    }
}
