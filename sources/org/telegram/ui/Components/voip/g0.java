package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ g0(l0 l0Var, int i3) {
        this.a = i3;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.getClass();
                l0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            case 1:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                l0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = l0Var2.J + org.telegram.messenger.g0.L(28.0f);
                float L2 = l0Var2.K + org.telegram.messenger.g0.L(52.0f);
                float f10 = l0Var2.E;
                l0Var2.H = L - (L * f10);
                l0Var2.I = L2 - (f10 * L2);
                l0Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0 l0Var3 = this.b;
                l0Var3.F = floatValue;
                int L3 = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                j0 j0Var = l0Var3.c;
                j0Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L3 * l0Var3.F));
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
