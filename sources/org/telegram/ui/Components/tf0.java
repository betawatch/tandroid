package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf0 b;

    public /* synthetic */ tf0(vf0 vf0Var, int i10) {
        this.a = i10;
        this.b = vf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vf0 vf0Var = this.b;
                vf0Var.getClass();
                vf0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var.invalidate();
                break;
            default:
                vf0 vf0Var2 = this.b;
                vf0Var2.getClass();
                vf0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var2.invalidate();
                break;
        }
    }
}
