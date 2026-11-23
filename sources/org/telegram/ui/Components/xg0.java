package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;

    public /* synthetic */ xg0(yg0 yg0Var, int i7) {
        this.a = i7;
        this.b = yg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var = this.b;
                yg0Var.v = floatValue;
                org.telegram.ui.Cells.u2 u2Var = yg0Var.H;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                ek0 ek0Var = yg0Var.I;
                if (ek0Var != null) {
                    ek0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var2 = this.b;
                yg0Var2.w = floatValue2;
                org.telegram.ui.Cells.u2 u2Var2 = yg0Var2.H;
                if (u2Var2 != null) {
                    u2Var2.invalidate();
                }
                ek0 ek0Var2 = yg0Var2.I;
                if (ek0Var2 != null) {
                    ek0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var3 = this.b;
                yg0Var3.p = floatValue3;
                org.telegram.ui.Cells.u2 u2Var3 = yg0Var3.H;
                if (u2Var3 != null) {
                    u2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var4 = this.b;
                yg0Var4.o = floatValue4;
                org.telegram.ui.Cells.u2 u2Var4 = yg0Var4.H;
                if (u2Var4 != null) {
                    u2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var5 = this.b;
                yg0Var5.x = floatValue5;
                org.telegram.ui.Cells.u2 u2Var5 = yg0Var5.H;
                if (u2Var5 != null) {
                    u2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                yg0 yg0Var6 = this.b;
                yg0Var6.getClass();
                yg0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.u2 u2Var6 = yg0Var6.H;
                if (u2Var6 != null) {
                    u2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                yg0 yg0Var7 = this.b;
                yg0Var7.getClass();
                yg0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var7.F = true;
                org.telegram.ui.Cells.u2 u2Var7 = yg0Var7.H;
                if (u2Var7 != null) {
                    u2Var7.invalidate();
                    break;
                }
                break;
            default:
                yg0 yg0Var8 = this.b;
                yg0Var8.getClass();
                yg0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var8.F = false;
                org.telegram.ui.Cells.u2 u2Var8 = yg0Var8.H;
                if (u2Var8 != null) {
                    u2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
