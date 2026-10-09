package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nj0 b;

    public /* synthetic */ lj0(nj0 nj0Var, int i10) {
        this.a = i10;
        this.b = nj0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var = this.b;
                nj0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = nj0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                qm0 qm0Var = nj0Var.I;
                if (qm0Var != null) {
                    qm0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var2 = this.b;
                nj0Var2.w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = nj0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                qm0 qm0Var2 = nj0Var2.I;
                if (qm0Var2 != null) {
                    qm0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var3 = this.b;
                nj0Var3.p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = nj0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var4 = this.b;
                nj0Var4.o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = nj0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var5 = this.b;
                nj0Var5.x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = nj0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                nj0 nj0Var6 = this.b;
                nj0Var6.getClass();
                nj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = nj0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                nj0 nj0Var7 = this.b;
                nj0Var7.getClass();
                nj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = nj0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    break;
                }
                break;
            default:
                nj0 nj0Var8 = this.b;
                nj0Var8.getClass();
                nj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = nj0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
