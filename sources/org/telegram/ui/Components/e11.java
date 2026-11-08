package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h11 b;

    public /* synthetic */ e11(h11 h11Var, int i7) {
        this.a = i7;
        this.b = h11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                di.b3 b3Var = this.b.f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                break;
            default:
                h11 h11Var = this.b;
                h11Var.getClass();
                h11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h11Var.h();
                break;
        }
    }
}
