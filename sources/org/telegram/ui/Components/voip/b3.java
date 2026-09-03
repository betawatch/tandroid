package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ b3(d3 d3Var, int i10) {
        this.a = i10;
        this.b = d3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                d3Var.getClass();
                d3Var.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var.invalidate();
                d3Var.Q.c();
                break;
            case 1:
                d3 d3Var2 = this.b;
                d3Var2.getClass();
                d3Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var2.invalidate();
                d3Var2.Q.c();
                break;
            case 2:
                d3 d3Var3 = this.b;
                d3Var3.getClass();
                d3Var3.E = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var3.invalidate();
                d3Var3.Q.c();
                break;
            case 3:
                d3 d3Var4 = this.b;
                d3Var4.getClass();
                d3Var4.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var4.invalidate();
                break;
            case 4:
                d3 d3Var5 = this.b;
                d3Var5.getClass();
                d3Var5.C = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var5.invalidate();
                break;
            default:
                d3 d3Var6 = this.b;
                d3Var6.getClass();
                d3Var6.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var6.invalidate();
                break;
        }
    }
}
