package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ l4(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                z5Var.getClass();
                z5Var.N0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                z5 z5Var2 = this.b;
                z5Var2.getClass();
                z5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var2.U0();
                break;
        }
    }
}
