package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ h2(j2 j2Var, int i3) {
        this.a = i3;
        this.b = j2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j2 j2Var = this.b;
                j2Var.getClass();
                j2Var.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var.invalidate();
                j2Var.U.c();
                break;
            case 1:
                j2 j2Var2 = this.b;
                j2Var2.getClass();
                j2Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j2Var2.invalidate();
                j2Var2.U.c();
                break;
            case 2:
                j2 j2Var3 = this.b;
                j2Var3.getClass();
                j2Var3.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var3.invalidate();
                j2Var3.U.c();
                break;
            case 3:
                j2 j2Var4 = this.b;
                j2Var4.getClass();
                j2Var4.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var4.invalidate();
                break;
            case 4:
                j2 j2Var5 = this.b;
                j2Var5.getClass();
                j2Var5.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var5.invalidate();
                break;
            default:
                j2 j2Var6 = this.b;
                j2Var6.getClass();
                j2Var6.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j2Var6.invalidate();
                break;
        }
    }
}
