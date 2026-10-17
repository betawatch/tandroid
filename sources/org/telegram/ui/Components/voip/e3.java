package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ e3(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b;
                h3Var.getClass();
                h3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.invalidate();
                break;
            case 1:
                h3 h3Var2 = this.b;
                h3Var2.getClass();
                h3Var2.w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var2.invalidate();
                break;
            case 2:
                h3 h3Var3 = this.b;
                h3Var3.getClass();
                h3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var3.invalidate();
                break;
            default:
                h3 h3Var4 = this.b;
                h3Var4.getClass();
                h3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var4.invalidate();
                break;
        }
    }
}
