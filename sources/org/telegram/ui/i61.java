package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l61 b;

    public /* synthetic */ i61(l61 l61Var, int i10) {
        this.a = i10;
        this.b = l61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var = this.b;
                l61Var.N = floatValue;
                l61Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var2 = this.b;
                l61Var2.N = floatValue2;
                l61Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var3 = this.b;
                l61Var3.N = floatValue3;
                l61Var3.V.h0.invalidate();
                break;
        }
    }
}
