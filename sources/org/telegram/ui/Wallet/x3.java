package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ x3(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l5 l5Var = this.b;
                l5Var.getClass();
                l5Var.F0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                l5 l5Var2 = this.b;
                l5Var2.getClass();
                l5Var2.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var2.M0();
                break;
        }
    }
}
