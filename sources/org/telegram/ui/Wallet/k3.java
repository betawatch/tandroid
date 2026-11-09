package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ k3(n3 n3Var, int i7) {
        this.a = i7;
        this.b = n3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                n3Var.getClass();
                n3Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var.e();
                break;
            default:
                n3 n3Var2 = this.b;
                n3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var2.Q = floatValue;
                n3Var2.r.setUseGyroscope(floatValue);
                break;
        }
    }
}
