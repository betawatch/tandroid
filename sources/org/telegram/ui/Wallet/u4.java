package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    public /* synthetic */ u4(n6 n6Var, int i7) {
        this.a = i7;
        this.b = n6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n6 n6Var = this.b;
                n6Var.getClass();
                n6Var.R0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                n6 n6Var2 = this.b;
                n6Var2.getClass();
                n6Var2.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var2.Y0();
                break;
        }
    }
}
