package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j21 b;

    public /* synthetic */ h21(j21 j21Var, int i10) {
        this.a = i10;
        this.b = j21Var;
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
                j21 j21Var = this.b;
                j21Var.getClass();
                j21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j21Var.h();
                break;
        }
    }
}
