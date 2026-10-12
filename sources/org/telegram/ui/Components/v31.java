package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ v31(x31 x31Var, int i10) {
        this.a = i10;
        this.b = x31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x31 x31Var = this.b;
                x31Var.getClass();
                x31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x31Var.h();
                x31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x31 x31Var2 = this.b;
                x31Var2.K = max;
                x31Var2.h.invalidate();
                break;
        }
    }
}
