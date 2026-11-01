package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ l4(b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b6 b6Var = this.b;
                b6Var.getClass();
                b6Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                b6 b6Var2 = this.b;
                b6Var2.getClass();
                b6Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var2.T0();
                break;
        }
    }
}
