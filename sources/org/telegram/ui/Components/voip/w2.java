package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ w2(y2 y2Var, int i7) {
        this.a = i7;
        this.b = y2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                y2Var.getClass();
                y2Var.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var.invalidate();
                y2Var.U.c();
                break;
            case 1:
                y2 y2Var2 = this.b;
                y2Var2.getClass();
                y2Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.invalidate();
                y2Var2.U.c();
                break;
            case 2:
                y2 y2Var3 = this.b;
                y2Var3.getClass();
                y2Var3.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var3.invalidate();
                y2Var3.U.c();
                break;
            case 3:
                y2 y2Var4 = this.b;
                y2Var4.getClass();
                y2Var4.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var4.invalidate();
                break;
            case 4:
                y2 y2Var5 = this.b;
                y2Var5.getClass();
                y2Var5.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var5.invalidate();
                break;
            default:
                y2 y2Var6 = this.b;
                y2Var6.getClass();
                y2Var6.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var6.invalidate();
                break;
        }
    }
}
