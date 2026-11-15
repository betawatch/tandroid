package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ mg0(ng0 ng0Var, int i7) {
        this.a = i7;
        this.b = ng0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var = this.b;
                ng0Var.v = floatValue;
                org.telegram.ui.Cells.t2 t2Var = ng0Var.H;
                if (t2Var != null) {
                    t2Var.invalidate();
                }
                uj0 uj0Var = ng0Var.I;
                if (uj0Var != null) {
                    uj0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var2 = this.b;
                ng0Var2.w = floatValue2;
                org.telegram.ui.Cells.t2 t2Var2 = ng0Var2.H;
                if (t2Var2 != null) {
                    t2Var2.invalidate();
                }
                uj0 uj0Var2 = ng0Var2.I;
                if (uj0Var2 != null) {
                    uj0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var3 = this.b;
                ng0Var3.p = floatValue3;
                org.telegram.ui.Cells.t2 t2Var3 = ng0Var3.H;
                if (t2Var3 != null) {
                    t2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var4 = this.b;
                ng0Var4.o = floatValue4;
                org.telegram.ui.Cells.t2 t2Var4 = ng0Var4.H;
                if (t2Var4 != null) {
                    t2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var5 = this.b;
                ng0Var5.x = floatValue5;
                org.telegram.ui.Cells.t2 t2Var5 = ng0Var5.H;
                if (t2Var5 != null) {
                    t2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ng0 ng0Var6 = this.b;
                ng0Var6.getClass();
                ng0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.t2 t2Var6 = ng0Var6.H;
                if (t2Var6 != null) {
                    t2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ng0 ng0Var7 = this.b;
                ng0Var7.getClass();
                ng0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var7.F = true;
                org.telegram.ui.Cells.t2 t2Var7 = ng0Var7.H;
                if (t2Var7 != null) {
                    t2Var7.invalidate();
                    break;
                }
                break;
            default:
                ng0 ng0Var8 = this.b;
                ng0Var8.getClass();
                ng0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var8.F = false;
                org.telegram.ui.Cells.t2 t2Var8 = ng0Var8.H;
                if (t2Var8 != null) {
                    t2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
