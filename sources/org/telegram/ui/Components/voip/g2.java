package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ g2(j2 j2Var, int i10) {
        this.a = i10;
        this.b = j2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j2 j2Var = this.b;
                j2Var.getClass();
                j2Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var.invalidate();
                j2Var.T.c();
                break;
            case 1:
                j2 j2Var2 = this.b;
                j2Var2.getClass();
                j2Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j2Var2.invalidate();
                j2Var2.T.c();
                break;
            case 2:
                j2 j2Var3 = this.b;
                j2Var3.getClass();
                j2Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var3.invalidate();
                j2Var3.T.c();
                break;
            case 3:
                j2 j2Var4 = this.b;
                j2Var4.getClass();
                j2Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var4.invalidate();
                break;
            case 4:
                j2 j2Var5 = this.b;
                j2Var5.getClass();
                j2Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var5.invalidate();
                break;
            default:
                j2 j2Var6 = this.b;
                j2Var6.getClass();
                j2Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var6.invalidate();
                break;
        }
    }
}
