package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;

    public /* synthetic */ h01(k01 k01Var, int i10) {
        this.a = i10;
        this.b = k01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k01 k01Var = this.b;
                k01Var.getClass();
                k01Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var.g();
                break;
            case 1:
                k01 k01Var2 = this.b;
                k01Var2.getClass();
                k01Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var2.g();
                break;
            default:
                k01 k01Var3 = this.b;
                k01Var3.getClass();
                k01Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var3.g();
                break;
        }
    }
}
