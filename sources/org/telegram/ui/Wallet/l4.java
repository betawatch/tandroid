package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ l4(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y5 y5Var = this.b;
                y5Var.getClass();
                y5Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                y5 y5Var2 = this.b;
                y5Var2.getClass();
                y5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var2.T0();
                break;
        }
    }
}
