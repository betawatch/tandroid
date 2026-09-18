package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ v21(x21 x21Var, int i10) {
        this.a = i10;
        this.b = x21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x21 x21Var = this.b;
                x21Var.getClass();
                x21Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.h();
                x21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x21 x21Var2 = this.b;
                x21Var2.K = max;
                x21Var2.h.invalidate();
                break;
        }
    }
}
