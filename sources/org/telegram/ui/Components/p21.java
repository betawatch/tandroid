package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                oh.b3 b3Var = this.b.f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
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
