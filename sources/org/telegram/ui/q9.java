package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ q9(w9 w9Var, int i10) {
        this.a = i10;
        this.b = w9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = this.b;
                w9Var.X = floatValue;
                w9Var.a.setAlpha(1.0f - floatValue);
                if (w9Var.V == 3) {
                    w9Var.b.setAlpha(1.0f - w9Var.X);
                }
                w9Var.r.setAlpha(1.0f - w9Var.X);
                w9Var.v = (w9Var.X * 0.25f) + 0.5f;
                w9Var.fragmentView.invalidate();
                break;
            default:
                this.b.r.invalidate();
                break;
        }
    }
}
