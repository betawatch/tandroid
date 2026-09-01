package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pi0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri0 b;

    public /* synthetic */ pi0(ri0 ri0Var, int i10) {
        this.a = i10;
        this.b = ri0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var = this.b;
                ri0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = ri0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                tl0 tl0Var = ri0Var.I;
                if (tl0Var != null) {
                    tl0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var2 = this.b;
                ri0Var2.w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = ri0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                tl0 tl0Var2 = ri0Var2.I;
                if (tl0Var2 != null) {
                    tl0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var3 = this.b;
                ri0Var3.p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = ri0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var4 = this.b;
                ri0Var4.o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = ri0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var5 = this.b;
                ri0Var5.x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = ri0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ri0 ri0Var6 = this.b;
                ri0Var6.getClass();
                ri0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = ri0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ri0 ri0Var7 = this.b;
                ri0Var7.getClass();
                ri0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = ri0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    break;
                }
                break;
            default:
                ri0 ri0Var8 = this.b;
                ri0Var8.getClass();
                ri0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = ri0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
