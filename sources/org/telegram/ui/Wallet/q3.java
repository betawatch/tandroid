package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ q3(x3 x3Var, int i7) {
        this.a = i7;
        this.b = x3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                x3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.R = floatValue;
                x3Var.r.setUseGyroscope(floatValue);
                break;
            default:
                x3 x3Var2 = this.b;
                x3Var2.getClass();
                x3Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var2.e();
                break;
        }
    }
}
