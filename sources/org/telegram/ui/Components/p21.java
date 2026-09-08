package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                bi.a4 a4Var = this.b.f;
                a4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a4Var.invalidate();
                break;
            default:
                r21 r21Var = this.b;
                r21Var.getClass();
                r21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21Var.h();
                break;
        }
    }
}
