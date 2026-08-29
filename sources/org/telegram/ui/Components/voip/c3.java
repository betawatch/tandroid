package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ c3(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                e3Var.getClass();
                e3Var.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.invalidate();
                e3Var.P.c();
                break;
            case 1:
                e3 e3Var2 = this.b;
                e3Var2.getClass();
                e3Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var2.invalidate();
                e3Var2.P.c();
                break;
            case 2:
                e3 e3Var3 = this.b;
                e3Var3.getClass();
                e3Var3.D = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var3.invalidate();
                e3Var3.P.c();
                break;
            case 3:
                e3 e3Var4 = this.b;
                e3Var4.getClass();
                e3Var4.A = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var4.invalidate();
                break;
            case 4:
                e3 e3Var5 = this.b;
                e3Var5.getClass();
                e3Var5.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var5.invalidate();
                break;
            default:
                e3 e3Var6 = this.b;
                e3Var6.getClass();
                e3Var6.A = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var6.invalidate();
                break;
        }
    }
}
