package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n41 b;

    public /* synthetic */ k41(n41 n41Var, int i10) {
        this.a = i10;
        this.b = n41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n41 n41Var = this.b;
                n41Var.getClass();
                n41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var.g();
                break;
            case 1:
                n41 n41Var2 = this.b;
                n41Var2.getClass();
                n41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var2.g();
                break;
            default:
                n41 n41Var3 = this.b;
                n41Var3.getClass();
                n41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var3.g();
                break;
        }
    }
}
