package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r21 b;

    public /* synthetic */ p21(r21 r21Var, int i10) {
        this.a = i10;
        this.b = r21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                nh.a3 a3Var = this.b.f;
                a3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a3Var.invalidate();
                break;
            default:
                r21 r21Var = this.b;
                r21Var.getClass();
                r21Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21Var.h();
                break;
        }
    }
}
