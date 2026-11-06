package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ s2(u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                u2Var.getClass();
                u2Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var.invalidate();
                u2Var.T.c();
                break;
            case 1:
                u2 u2Var2 = this.b;
                u2Var2.getClass();
                u2Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                u2Var2.T.c();
                break;
            case 2:
                u2 u2Var3 = this.b;
                u2Var3.getClass();
                u2Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var3.invalidate();
                u2Var3.T.c();
                break;
            case 3:
                u2 u2Var4 = this.b;
                u2Var4.getClass();
                u2Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var4.invalidate();
                break;
            case 4:
                u2 u2Var5 = this.b;
                u2Var5.getClass();
                u2Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var5.invalidate();
                break;
            default:
                u2 u2Var6 = this.b;
                u2Var6.getClass();
                u2Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var6.invalidate();
                break;
        }
    }
}
