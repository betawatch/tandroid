package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ k4(x5 x5Var, int i7) {
        this.a = i7;
        this.b = x5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x5 x5Var = this.b;
                x5Var.getClass();
                x5Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                x5 x5Var2 = this.b;
                x5Var2.getClass();
                x5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var2.T0();
                break;
        }
    }
}
