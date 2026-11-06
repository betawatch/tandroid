package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ m3(p3 p3Var, int i7) {
        this.a = i7;
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
