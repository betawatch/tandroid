package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ u2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                v2Var.getClass();
                v2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.a(v2Var.R, v2Var.S);
                break;
            default:
                v2 v2Var2 = this.b;
                v2Var2.getClass();
                v2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.invalidate();
                break;
        }
    }
}
