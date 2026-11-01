package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh0 b;

    public /* synthetic */ mh0(nh0 nh0Var, int i10) {
        this.a = i10;
        this.b = nh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var = this.b;
                nh0Var.v = floatValue;
                org.telegram.ui.Cells.v2 v2Var = nh0Var.H;
                if (v2Var != null) {
                    v2Var.invalidate();
                }
                uk0 uk0Var = nh0Var.I;
                if (uk0Var != null) {
                    uk0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var2 = this.b;
                nh0Var2.w = floatValue2;
                org.telegram.ui.Cells.v2 v2Var2 = nh0Var2.H;
                if (v2Var2 != null) {
                    v2Var2.invalidate();
                }
                uk0 uk0Var2 = nh0Var2.I;
                if (uk0Var2 != null) {
                    uk0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var3 = this.b;
                nh0Var3.p = floatValue3;
                org.telegram.ui.Cells.v2 v2Var3 = nh0Var3.H;
                if (v2Var3 != null) {
                    v2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var4 = this.b;
                nh0Var4.o = floatValue4;
                org.telegram.ui.Cells.v2 v2Var4 = nh0Var4.H;
                if (v2Var4 != null) {
                    v2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var5 = this.b;
                nh0Var5.x = floatValue5;
                org.telegram.ui.Cells.v2 v2Var5 = nh0Var5.H;
                if (v2Var5 != null) {
                    v2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                nh0 nh0Var6 = this.b;
                nh0Var6.getClass();
                nh0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.v2 v2Var6 = nh0Var6.H;
                if (v2Var6 != null) {
                    v2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                nh0 nh0Var7 = this.b;
                nh0Var7.getClass();
                nh0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0Var7.F = true;
                org.telegram.ui.Cells.v2 v2Var7 = nh0Var7.H;
                if (v2Var7 != null) {
                    v2Var7.invalidate();
                    break;
                }
                break;
            default:
                nh0 nh0Var8 = this.b;
                nh0Var8.getClass();
                nh0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0Var8.F = false;
                org.telegram.ui.Cells.v2 v2Var8 = nh0Var8.H;
                if (v2Var8 != null) {
                    v2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
