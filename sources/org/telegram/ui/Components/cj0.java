package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej0 b;

    public /* synthetic */ cj0(ej0 ej0Var, int i10) {
        this.a = i10;
        this.b = ej0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var = this.b;
                ej0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = ej0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                im0 im0Var = ej0Var.I;
                if (im0Var != null) {
                    im0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var2 = this.b;
                ej0Var2.w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = ej0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                im0 im0Var2 = ej0Var2.I;
                if (im0Var2 != null) {
                    im0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var3 = this.b;
                ej0Var3.p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = ej0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var4 = this.b;
                ej0Var4.o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = ej0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var5 = this.b;
                ej0Var5.x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = ej0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ej0 ej0Var6 = this.b;
                ej0Var6.getClass();
                ej0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = ej0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ej0 ej0Var7 = this.b;
                ej0Var7.getClass();
                ej0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = ej0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    break;
                }
                break;
            default:
                ej0 ej0Var8 = this.b;
                ej0Var8.getClass();
                ej0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = ej0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
