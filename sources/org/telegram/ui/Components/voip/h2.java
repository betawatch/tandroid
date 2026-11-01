package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ h2(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k2 k2Var = this.b;
                k2Var.getClass();
                k2Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var.invalidate();
                k2Var.T.c();
                break;
            case 1:
                k2 k2Var2 = this.b;
                k2Var2.getClass();
                k2Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var2.invalidate();
                k2Var2.T.c();
                break;
            case 2:
                k2 k2Var3 = this.b;
                k2Var3.getClass();
                k2Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var3.invalidate();
                k2Var3.T.c();
                break;
            case 3:
                k2 k2Var4 = this.b;
                k2Var4.getClass();
                k2Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var4.invalidate();
                break;
            case 4:
                k2 k2Var5 = this.b;
                k2Var5.getClass();
                k2Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var5.invalidate();
                break;
            default:
                k2 k2Var6 = this.b;
                k2Var6.getClass();
                k2Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k2Var6.invalidate();
                break;
        }
    }
}
