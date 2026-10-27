package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a41 b;

    public /* synthetic */ y31(a41 a41Var, int i10) {
        this.a = i10;
        this.b = a41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                di.h3 h3Var = this.b.f;
                h3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.invalidate();
                break;
            default:
                a41 a41Var = this.b;
                a41Var.getClass();
                a41Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var.h();
                break;
        }
    }
}
