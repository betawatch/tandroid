package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei0 b;

    public /* synthetic */ ci0(ei0 ei0Var, int i10) {
        this.a = i10;
        this.b = ei0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var = this.b;
                ei0Var.v = floatValue;
                org.telegram.ui.Cells.p2 p2Var = ei0Var.H;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                jl0 jl0Var = ei0Var.I;
                if (jl0Var != null) {
                    jl0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var2 = this.b;
                ei0Var2.w = floatValue2;
                org.telegram.ui.Cells.p2 p2Var2 = ei0Var2.H;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                }
                jl0 jl0Var2 = ei0Var2.I;
                if (jl0Var2 != null) {
                    jl0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var3 = this.b;
                ei0Var3.p = floatValue3;
                org.telegram.ui.Cells.p2 p2Var3 = ei0Var3.H;
                if (p2Var3 != null) {
                    p2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var4 = this.b;
                ei0Var4.o = floatValue4;
                org.telegram.ui.Cells.p2 p2Var4 = ei0Var4.H;
                if (p2Var4 != null) {
                    p2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var5 = this.b;
                ei0Var5.x = floatValue5;
                org.telegram.ui.Cells.p2 p2Var5 = ei0Var5.H;
                if (p2Var5 != null) {
                    p2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ei0 ei0Var6 = this.b;
                ei0Var6.getClass();
                ei0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.p2 p2Var6 = ei0Var6.H;
                if (p2Var6 != null) {
                    p2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ei0 ei0Var7 = this.b;
                ei0Var7.getClass();
                ei0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0Var7.F = true;
                org.telegram.ui.Cells.p2 p2Var7 = ei0Var7.H;
                if (p2Var7 != null) {
                    p2Var7.invalidate();
                    break;
                }
                break;
            default:
                ei0 ei0Var8 = this.b;
                ei0Var8.getClass();
                ei0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0Var8.F = false;
                org.telegram.ui.Cells.p2 p2Var8 = ei0Var8.H;
                if (p2Var8 != null) {
                    p2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
