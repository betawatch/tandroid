package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t21 b;

    public /* synthetic */ r21(t21 t21Var, int i10) {
        this.a = i10;
        this.b = t21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ai.n4 n4Var = this.b.f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                break;
            default:
                t21 t21Var = this.b;
                t21Var.getClass();
                t21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t21Var.h();
                break;
        }
    }
}
