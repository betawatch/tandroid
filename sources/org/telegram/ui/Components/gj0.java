package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ij0 b;

    public /* synthetic */ gj0(ij0 ij0Var, int i10) {
        this.a = i10;
        this.b = ij0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var = this.b;
                ij0Var.v = floatValue;
                org.telegram.ui.Cells.p2 p2Var = ij0Var.H;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                nm0 nm0Var = ij0Var.I;
                if (nm0Var != null) {
                    nm0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var2 = this.b;
                ij0Var2.w = floatValue2;
                org.telegram.ui.Cells.p2 p2Var2 = ij0Var2.H;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                }
                nm0 nm0Var2 = ij0Var2.I;
                if (nm0Var2 != null) {
                    nm0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var3 = this.b;
                ij0Var3.p = floatValue3;
                org.telegram.ui.Cells.p2 p2Var3 = ij0Var3.H;
                if (p2Var3 != null) {
                    p2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var4 = this.b;
                ij0Var4.o = floatValue4;
                org.telegram.ui.Cells.p2 p2Var4 = ij0Var4.H;
                if (p2Var4 != null) {
                    p2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var5 = this.b;
                ij0Var5.x = floatValue5;
                org.telegram.ui.Cells.p2 p2Var5 = ij0Var5.H;
                if (p2Var5 != null) {
                    p2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ij0 ij0Var6 = this.b;
                ij0Var6.getClass();
                ij0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.p2 p2Var6 = ij0Var6.H;
                if (p2Var6 != null) {
                    p2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ij0 ij0Var7 = this.b;
                ij0Var7.getClass();
                ij0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0Var7.F = true;
                org.telegram.ui.Cells.p2 p2Var7 = ij0Var7.H;
                if (p2Var7 != null) {
                    p2Var7.invalidate();
                    break;
                }
                break;
            default:
                ij0 ij0Var8 = this.b;
                ij0Var8.getClass();
                ij0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0Var8.F = false;
                org.telegram.ui.Cells.p2 p2Var8 = ij0Var8.H;
                if (p2Var8 != null) {
                    p2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
