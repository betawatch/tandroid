package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ b2(c2 c2Var, int i10) {
        this.a = i10;
        this.b = c2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.getClass();
                c2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.a(c2Var.R, c2Var.S);
                break;
            default:
                c2 c2Var2 = this.b;
                c2Var2.getClass();
                c2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var2.invalidate();
                break;
        }
    }
}
