package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k21 b;

    public /* synthetic */ i21(k21 k21Var, int i10) {
        this.a = i10;
        this.b = k21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ih.c cVar = this.b.f;
                cVar.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                cVar.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                cVar.invalidate();
                break;
            default:
                k21 k21Var = this.b;
                k21Var.getClass();
                k21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k21Var.h();
                break;
        }
    }
}
