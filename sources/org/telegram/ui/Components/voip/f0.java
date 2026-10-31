package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ f0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.getClass();
                l0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            case 1:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                l0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = l0Var2.I + org.telegram.messenger.i0.L(28.0f);
                float L2 = l0Var2.J + org.telegram.messenger.i0.L(52.0f);
                float f7 = l0Var2.D;
                l0Var2.G = L - (L * f7);
                l0Var2.H = L2 - (f7 * L2);
                l0Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0 l0Var3 = this.b;
                l0Var3.E = floatValue;
                int L3 = (org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(36.0f)) - org.telegram.messenger.i0.L(52.0f);
                j0 j0Var = l0Var3.c;
                j0Var.getLayoutParams().width = org.telegram.messenger.i0.L(52.0f) + ((int) (L3 * l0Var3.E));
                j0Var.requestLayout();
                break;
            default:
                l0 l0Var4 = this.b;
                l0Var4.getClass();
                l0Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var4.e();
                break;
        }
    }
}
