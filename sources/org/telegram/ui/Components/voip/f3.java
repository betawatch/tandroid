package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ f3(i3 i3Var, int i10) {
        this.a = i10;
        this.b = i3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i3 i3Var = this.b;
                i3Var.getClass();
                i3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i3Var.invalidate();
                break;
            case 1:
                i3 i3Var2 = this.b;
                i3Var2.getClass();
                i3Var2.w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var2.invalidate();
                break;
            case 2:
                i3 i3Var3 = this.b;
                i3Var3.getClass();
                i3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var3.invalidate();
                break;
            default:
                i3 i3Var4 = this.b;
                i3Var4.getClass();
                i3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3Var4.invalidate();
                break;
        }
    }
}
