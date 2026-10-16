package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
