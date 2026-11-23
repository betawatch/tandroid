package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ p3(w3 w3Var, int i7) {
        this.a = i7;
        this.b = w3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                w3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.R = floatValue;
                w3Var.r.setUseGyroscope(floatValue);
                break;
            default:
                w3 w3Var2 = this.b;
                w3Var2.getClass();
                w3Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.e();
                break;
        }
    }
}
