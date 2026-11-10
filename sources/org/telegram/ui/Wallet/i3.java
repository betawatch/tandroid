package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ i3(p3 p3Var, int i7) {
        this.a = i7;
        this.b = p3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p3 p3Var = this.b;
                p3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var.Q = floatValue;
                p3Var.r.setUseGyroscope(floatValue);
                break;
            default:
                p3 p3Var2 = this.b;
                p3Var2.getClass();
                p3Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var2.e();
                break;
        }
    }
}
