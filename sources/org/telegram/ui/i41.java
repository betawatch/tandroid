package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l41 b;

    public /* synthetic */ i41(l41 l41Var, int i10) {
        this.a = i10;
        this.b = l41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l41 l41Var = this.b;
                l41Var.getClass();
                l41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.g();
                break;
            case 1:
                l41 l41Var2 = this.b;
                l41Var2.getClass();
                l41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var2.g();
                break;
            default:
                l41 l41Var3 = this.b;
                l41Var3.getClass();
                l41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var3.g();
                break;
        }
    }
}
