package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ h3(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                k3Var.getClass();
                k3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.invalidate();
                break;
            case 1:
                k3 k3Var2 = this.b;
                k3Var2.getClass();
                k3Var2.w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var2.invalidate();
                break;
            case 2:
                k3 k3Var3 = this.b;
                k3Var3.getClass();
                k3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var3.invalidate();
                break;
            default:
                k3 k3Var4 = this.b;
                k3Var4.getClass();
                k3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var4.invalidate();
                break;
        }
    }
}
