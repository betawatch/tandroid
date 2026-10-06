package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class t31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ t31(v31 v31Var, int i10) {
        this.a = i10;
        this.b = v31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v31 v31Var = this.b;
                v31Var.getClass();
                v31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.h();
                v31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v31 v31Var2 = this.b;
                v31Var2.K = max;
                v31Var2.h.invalidate();
                break;
        }
    }
}
