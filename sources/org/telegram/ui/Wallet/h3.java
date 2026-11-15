package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ h3(o3 o3Var, int i7) {
        this.a = i7;
        this.b = o3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o3 o3Var = this.b;
                o3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var.R = floatValue;
                o3Var.r.setUseGyroscope(floatValue);
                break;
            default:
                o3 o3Var2 = this.b;
                o3Var2.getClass();
                o3Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var2.e();
                break;
        }
    }
}
