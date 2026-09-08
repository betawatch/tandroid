package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ y2(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                a3Var.getClass();
                a3Var.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var.invalidate();
                a3Var.T.c();
                break;
            case 1:
                a3 a3Var2 = this.b;
                a3Var2.getClass();
                a3Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.invalidate();
                a3Var2.T.c();
                break;
            case 2:
                a3 a3Var3 = this.b;
                a3Var3.getClass();
                a3Var3.H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var3.invalidate();
                a3Var3.T.c();
                break;
            case 3:
                a3 a3Var4 = this.b;
                a3Var4.getClass();
                a3Var4.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var4.invalidate();
                break;
            case 4:
                a3 a3Var5 = this.b;
                a3Var5.getClass();
                a3Var5.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var5.invalidate();
                break;
            default:
                a3 a3Var6 = this.b;
                a3Var6.getClass();
                a3Var6.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a3Var6.invalidate();
                break;
        }
    }
}
