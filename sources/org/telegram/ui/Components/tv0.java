package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv0 b;

    public /* synthetic */ tv0(wv0 wv0Var, int i10) {
        this.a = i10;
        this.b = wv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wv0 wv0Var = this.b;
                wv0Var.getClass();
                wv0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wv0Var.invalidate();
                break;
            case 1:
                wv0 wv0Var2 = this.b;
                wv0Var2.getClass();
                wv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                wv0 wv0Var3 = this.b;
                wv0Var3.getClass();
                wv0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wv0Var3.invalidate();
                break;
        }
    }
}
