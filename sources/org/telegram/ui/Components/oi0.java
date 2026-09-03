package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi0 b;

    public /* synthetic */ oi0(qi0 qi0Var, int i10) {
        this.a = i10;
        this.b = qi0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var = this.b;
                qi0Var.v = floatValue;
                org.telegram.ui.Cells.q2 q2Var = qi0Var.H;
                if (q2Var != null) {
                    q2Var.invalidate();
                }
                rl0 rl0Var = qi0Var.I;
                if (rl0Var != null) {
                    rl0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var2 = this.b;
                qi0Var2.w = floatValue2;
                org.telegram.ui.Cells.q2 q2Var2 = qi0Var2.H;
                if (q2Var2 != null) {
                    q2Var2.invalidate();
                }
                rl0 rl0Var2 = qi0Var2.I;
                if (rl0Var2 != null) {
                    rl0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var3 = this.b;
                qi0Var3.p = floatValue3;
                org.telegram.ui.Cells.q2 q2Var3 = qi0Var3.H;
                if (q2Var3 != null) {
                    q2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var4 = this.b;
                qi0Var4.o = floatValue4;
                org.telegram.ui.Cells.q2 q2Var4 = qi0Var4.H;
                if (q2Var4 != null) {
                    q2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var5 = this.b;
                qi0Var5.x = floatValue5;
                org.telegram.ui.Cells.q2 q2Var5 = qi0Var5.H;
                if (q2Var5 != null) {
                    q2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                qi0 qi0Var6 = this.b;
                qi0Var6.getClass();
                qi0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.q2 q2Var6 = qi0Var6.H;
                if (q2Var6 != null) {
                    q2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                qi0 qi0Var7 = this.b;
                qi0Var7.getClass();
                qi0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0Var7.F = true;
                org.telegram.ui.Cells.q2 q2Var7 = qi0Var7.H;
                if (q2Var7 != null) {
                    q2Var7.invalidate();
                    break;
                }
                break;
            default:
                qi0 qi0Var8 = this.b;
                qi0Var8.getClass();
                qi0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0Var8.F = false;
                org.telegram.ui.Cells.q2 q2Var8 = qi0Var8.H;
                if (q2Var8 != null) {
                    q2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
