package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ g0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m0Var.getClass();
                m0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                break;
            case 1:
                m0 m0Var2 = this.b;
                m0Var2.getClass();
                m0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = m0Var2.I + org.telegram.messenger.i0.L(28.0f);
                float L2 = m0Var2.J + org.telegram.messenger.i0.L(52.0f);
                float f7 = m0Var2.D;
                m0Var2.G = L - (L * f7);
                m0Var2.H = L2 - (f7 * L2);
                m0Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0 m0Var3 = this.b;
                m0Var3.E = floatValue;
                int L3 = (org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(36.0f)) - org.telegram.messenger.i0.L(52.0f);
                k0 k0Var = m0Var3.c;
                k0Var.getLayoutParams().width = org.telegram.messenger.i0.L(52.0f) + ((int) (L3 * m0Var3.E));
                k0Var.requestLayout();
                break;
            default:
                m0 m0Var4 = this.b;
                m0Var4.getClass();
                m0Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var4.e();
                break;
        }
    }
}
