package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii0 b;

    public /* synthetic */ gi0(ii0 ii0Var, int i10) {
        this.a = i10;
        this.b = ii0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var = this.b;
                ii0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = ii0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                ll0 ll0Var = ii0Var.I;
                if (ll0Var != null) {
                    ll0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var2 = this.b;
                ii0Var2.w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = ii0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                ll0 ll0Var2 = ii0Var2.I;
                if (ll0Var2 != null) {
                    ll0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var3 = this.b;
                ii0Var3.p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = ii0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var4 = this.b;
                ii0Var4.o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = ii0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var5 = this.b;
                ii0Var5.x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = ii0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ii0 ii0Var6 = this.b;
                ii0Var6.getClass();
                ii0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = ii0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ii0 ii0Var7 = this.b;
                ii0Var7.getClass();
                ii0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = ii0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    break;
                }
                break;
            default:
                ii0 ii0Var8 = this.b;
                ii0Var8.getClass();
                ii0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = ii0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
