package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ k3(n3 n3Var, int i3) {
        this.a = i3;
        this.b = n3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                n3Var.getClass();
                n3Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var.e();
                break;
            default:
                n3 n3Var2 = this.b;
                n3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var2.R = floatValue;
                n3Var2.r.setUseGyroscope(floatValue);
                break;
        }
    }
}
