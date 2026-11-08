package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ l3(o3 o3Var, int i7) {
        this.a = i7;
        this.b = o3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o3 o3Var = this.b;
                o3Var.getClass();
                o3Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var.e();
                break;
            default:
                o3 o3Var2 = this.b;
                o3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var2.Q = floatValue;
                o3Var2.r.setUseGyroscope(floatValue);
                break;
        }
    }
}
