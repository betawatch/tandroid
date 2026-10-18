package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ y3(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m5 m5Var = this.b;
                m5Var.getClass();
                m5Var.F0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                m5 m5Var2 = this.b;
                m5Var2.getClass();
                m5Var2.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var2.M0();
                break;
        }
    }
}
