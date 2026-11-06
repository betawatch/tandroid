package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
