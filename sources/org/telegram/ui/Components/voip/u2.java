package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ u2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                v2Var.getClass();
                v2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.a(v2Var.R, v2Var.S);
                break;
            default:
                v2 v2Var2 = this.b;
                v2Var2.getClass();
                v2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.invalidate();
                break;
        }
    }
}
