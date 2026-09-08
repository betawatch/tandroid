package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v21 b;

    public /* synthetic */ t21(v21 v21Var, int i10) {
        this.a = i10;
        this.b = v21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v21 v21Var = this.b;
                v21Var.getClass();
                v21Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v21Var.h();
                v21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v21 v21Var2 = this.b;
                v21Var2.K = max;
                v21Var2.h.invalidate();
                break;
        }
    }
}
