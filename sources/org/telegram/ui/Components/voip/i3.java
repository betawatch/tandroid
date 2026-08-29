package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ i3(l3 l3Var, int i10) {
        this.a = i10;
        this.b = l3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l3 l3Var = this.b;
                l3Var.getClass();
                l3Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var.invalidate();
                break;
            case 1:
                l3 l3Var2 = this.b;
                l3Var2.getClass();
                l3Var2.w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l3Var2.invalidate();
                break;
            case 2:
                l3 l3Var3 = this.b;
                l3Var3.getClass();
                l3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l3Var3.invalidate();
                break;
            default:
                l3 l3Var4 = this.b;
                l3Var4.getClass();
                l3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l3Var4.invalidate();
                break;
        }
    }
}
