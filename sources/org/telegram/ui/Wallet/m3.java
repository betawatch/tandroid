package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ m3(p3 p3Var, int i10) {
        this.a = i10;
        this.b = p3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p3 p3Var = this.b;
                p3Var.getClass();
                p3Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var.e();
                break;
            default:
                p3 p3Var2 = this.b;
                p3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var2.Q = floatValue;
                p3Var2.r.setUseGyroscope(floatValue);
                break;
        }
    }
}
