package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg0 b;

    public /* synthetic */ wg0(xg0 xg0Var, int i7) {
        this.a = i7;
        this.b = xg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var = this.b;
                xg0Var.v = floatValue;
                org.telegram.ui.Cells.u2 u2Var = xg0Var.H;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                ck0 ck0Var = xg0Var.I;
                if (ck0Var != null) {
                    ck0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var2 = this.b;
                xg0Var2.w = floatValue2;
                org.telegram.ui.Cells.u2 u2Var2 = xg0Var2.H;
                if (u2Var2 != null) {
                    u2Var2.invalidate();
                }
                ck0 ck0Var2 = xg0Var2.I;
                if (ck0Var2 != null) {
                    ck0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var3 = this.b;
                xg0Var3.p = floatValue3;
                org.telegram.ui.Cells.u2 u2Var3 = xg0Var3.H;
                if (u2Var3 != null) {
                    u2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var4 = this.b;
                xg0Var4.o = floatValue4;
                org.telegram.ui.Cells.u2 u2Var4 = xg0Var4.H;
                if (u2Var4 != null) {
                    u2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var5 = this.b;
                xg0Var5.x = floatValue5;
                org.telegram.ui.Cells.u2 u2Var5 = xg0Var5.H;
                if (u2Var5 != null) {
                    u2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                xg0 xg0Var6 = this.b;
                xg0Var6.getClass();
                xg0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.u2 u2Var6 = xg0Var6.H;
                if (u2Var6 != null) {
                    u2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                xg0 xg0Var7 = this.b;
                xg0Var7.getClass();
                xg0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var7.F = true;
                org.telegram.ui.Cells.u2 u2Var7 = xg0Var7.H;
                if (u2Var7 != null) {
                    u2Var7.invalidate();
                    break;
                }
                break;
            default:
                xg0 xg0Var8 = this.b;
                xg0Var8.getClass();
                xg0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var8.F = false;
                org.telegram.ui.Cells.u2 u2Var8 = xg0Var8.H;
                if (u2Var8 != null) {
                    u2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
