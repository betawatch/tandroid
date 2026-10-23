package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                org.telegram.ui.Cells.q2 q2Var = ij0Var.H;
                if (q2Var != null) {
                    q2Var.invalidate();
                }
                mm0 mm0Var = ij0Var.I;
                if (mm0Var != null) {
                    mm0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var2 = this.b;
                ij0Var2.w = floatValue2;
                org.telegram.ui.Cells.q2 q2Var2 = ij0Var2.H;
                if (q2Var2 != null) {
                    q2Var2.invalidate();
                }
                mm0 mm0Var2 = ij0Var2.I;
                if (mm0Var2 != null) {
                    mm0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var3 = this.b;
                ij0Var3.p = floatValue3;
                org.telegram.ui.Cells.q2 q2Var3 = ij0Var3.H;
                if (q2Var3 != null) {
                    q2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var4 = this.b;
                ij0Var4.o = floatValue4;
                org.telegram.ui.Cells.q2 q2Var4 = ij0Var4.H;
                if (q2Var4 != null) {
                    q2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var5 = this.b;
                ij0Var5.x = floatValue5;
                org.telegram.ui.Cells.q2 q2Var5 = ij0Var5.H;
                if (q2Var5 != null) {
                    q2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ij0 ij0Var6 = this.b;
                ij0Var6.getClass();
                ij0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.q2 q2Var6 = ij0Var6.H;
                if (q2Var6 != null) {
                    q2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ij0 ij0Var7 = this.b;
                ij0Var7.getClass();
                ij0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0Var7.F = true;
                org.telegram.ui.Cells.q2 q2Var7 = ij0Var7.H;
                if (q2Var7 != null) {
                    q2Var7.invalidate();
                    break;
                }
                break;
            default:
                ij0 ij0Var8 = this.b;
                ij0Var8.getClass();
                ij0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0Var8.F = false;
                org.telegram.ui.Cells.q2 q2Var8 = ij0Var8.H;
                if (q2Var8 != null) {
                    q2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
