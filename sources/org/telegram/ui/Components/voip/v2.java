package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ v2(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                x2Var.getClass();
                x2Var.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var.invalidate();
                x2Var.U.c();
                break;
            case 1:
                x2 x2Var2 = this.b;
                x2Var2.getClass();
                x2Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.invalidate();
                x2Var2.U.c();
                break;
            case 2:
                x2 x2Var3 = this.b;
                x2Var3.getClass();
                x2Var3.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var3.invalidate();
                x2Var3.U.c();
                break;
            case 3:
                x2 x2Var4 = this.b;
                x2Var4.getClass();
                x2Var4.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var4.invalidate();
                break;
            case 4:
                x2 x2Var5 = this.b;
                x2Var5.getClass();
                x2Var5.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var5.invalidate();
                break;
            default:
                x2 x2Var6 = this.b;
                x2Var6.getClass();
                x2Var6.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var6.invalidate();
                break;
        }
    }
}
