package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ v2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                y2Var.getClass();
                y2Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.e();
                break;
            default:
                y2 y2Var2 = this.b;
                y2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.Q = floatValue;
                y2Var2.r.setUseGyroscope(floatValue);
                break;
        }
    }
}
