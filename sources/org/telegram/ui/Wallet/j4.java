package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ j4(w5 w5Var, int i3) {
        this.a = i3;
        this.b = w5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w5 w5Var = this.b;
                w5Var.getClass();
                w5Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                w5 w5Var2 = this.b;
                w5Var2.getClass();
                w5Var2.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var2.T0();
                break;
        }
    }
}
