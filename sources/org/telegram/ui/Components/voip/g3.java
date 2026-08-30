package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ g3(j3 j3Var, int i10) {
        this.a = i10;
        this.b = j3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j3 j3Var = this.b;
                j3Var.getClass();
                j3Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var.invalidate();
                break;
            case 1:
                j3 j3Var2 = this.b;
                j3Var2.getClass();
                j3Var2.w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var2.invalidate();
                break;
            case 2:
                j3 j3Var3 = this.b;
                j3Var3.getClass();
                j3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var3.invalidate();
                break;
            default:
                j3 j3Var4 = this.b;
                j3Var4.getClass();
                j3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3Var4.invalidate();
                break;
        }
    }
}
