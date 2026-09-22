package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s21 b;

    public /* synthetic */ q21(s21 s21Var, int i10) {
        this.a = i10;
        this.b = s21Var;
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
                s21 s21Var = this.b;
                s21Var.getClass();
                s21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21Var.h();
                break;
        }
    }
}
