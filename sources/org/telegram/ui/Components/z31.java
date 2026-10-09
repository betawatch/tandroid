package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b41 b;

    public /* synthetic */ z31(b41 b41Var, int i10) {
        this.a = i10;
        this.b = b41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b41 b41Var = this.b;
                b41Var.getClass();
                b41Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b41Var.h();
                b41Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                b41 b41Var2 = this.b;
                b41Var2.K = max;
                b41Var2.h.invalidate();
                break;
        }
    }
}
