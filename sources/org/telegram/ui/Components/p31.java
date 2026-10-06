package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class p31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r31 b;

    public /* synthetic */ p31(r31 r31Var, int i10) {
        this.a = i10;
        this.b = r31Var;
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
                r31 r31Var = this.b;
                r31Var.getClass();
                r31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r31Var.h();
                break;
        }
    }
}
