package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
