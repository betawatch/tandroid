package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r31 b;

    public /* synthetic */ o31(r31 r31Var, int i10) {
        this.a = i10;
        this.b = r31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r31 r31Var = this.b;
                r31Var.getClass();
                r31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r31Var.h();
                r31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                r31 r31Var2 = this.b;
                r31Var2.K = max;
                r31Var2.h.invalidate();
                break;
        }
    }
}
