package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj0 b;

    public /* synthetic */ fj0(hj0 hj0Var, int i10) {
        this.a = i10;
        this.b = hj0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var = this.b;
                hj0Var.v = floatValue;
                org.telegram.ui.Cells.p2 p2Var = hj0Var.H;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                mm0 mm0Var = hj0Var.I;
                if (mm0Var != null) {
                    mm0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var2 = this.b;
                hj0Var2.w = floatValue2;
                org.telegram.ui.Cells.p2 p2Var2 = hj0Var2.H;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                }
                mm0 mm0Var2 = hj0Var2.I;
                if (mm0Var2 != null) {
                    mm0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var3 = this.b;
                hj0Var3.p = floatValue3;
                org.telegram.ui.Cells.p2 p2Var3 = hj0Var3.H;
                if (p2Var3 != null) {
                    p2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var4 = this.b;
                hj0Var4.o = floatValue4;
                org.telegram.ui.Cells.p2 p2Var4 = hj0Var4.H;
                if (p2Var4 != null) {
                    p2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var5 = this.b;
                hj0Var5.x = floatValue5;
                org.telegram.ui.Cells.p2 p2Var5 = hj0Var5.H;
                if (p2Var5 != null) {
                    p2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                hj0 hj0Var6 = this.b;
                hj0Var6.getClass();
                hj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.p2 p2Var6 = hj0Var6.H;
                if (p2Var6 != null) {
                    p2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                hj0 hj0Var7 = this.b;
                hj0Var7.getClass();
                hj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0Var7.F = true;
                org.telegram.ui.Cells.p2 p2Var7 = hj0Var7.H;
                if (p2Var7 != null) {
                    p2Var7.invalidate();
                    break;
                }
                break;
            default:
                hj0 hj0Var8 = this.b;
                hj0Var8.getClass();
                hj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0Var8.F = false;
                org.telegram.ui.Cells.p2 p2Var8 = hj0Var8.H;
                if (p2Var8 != null) {
                    p2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
