package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ sg0(vg0 vg0Var, int i10) {
        this.a = i10;
        this.b = vg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vg0 vg0Var = this.b;
                vg0Var.getClass();
                vg0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var.c(true);
                break;
            default:
                vg0 vg0Var2 = this.b;
                vg0Var2.getClass();
                vg0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var2.c(true);
                break;
        }
    }
}
