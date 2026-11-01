package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ o2(r2 r2Var, int i10) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.getClass();
                r2Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                break;
            case 1:
                r2 r2Var2 = this.b;
                r2Var2.getClass();
                r2Var2.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var2.invalidate();
                break;
            case 2:
                r2 r2Var3 = this.b;
                r2Var3.getClass();
                r2Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var3.invalidate();
                break;
            default:
                r2 r2Var4 = this.b;
                r2Var4.getClass();
                r2Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var4.invalidate();
                break;
        }
    }
}
