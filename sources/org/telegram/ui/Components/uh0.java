package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wh0 b;

    public /* synthetic */ uh0(wh0 wh0Var, int i10) {
        this.a = i10;
        this.b = wh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var = this.b;
                wh0Var.v = floatValue;
                org.telegram.ui.Cells.p2 p2Var = wh0Var.H;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                zk0 zk0Var = wh0Var.I;
                if (zk0Var != null) {
                    zk0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var2 = this.b;
                wh0Var2.w = floatValue2;
                org.telegram.ui.Cells.p2 p2Var2 = wh0Var2.H;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                }
                zk0 zk0Var2 = wh0Var2.I;
                if (zk0Var2 != null) {
                    zk0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var3 = this.b;
                wh0Var3.p = floatValue3;
                org.telegram.ui.Cells.p2 p2Var3 = wh0Var3.H;
                if (p2Var3 != null) {
                    p2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var4 = this.b;
                wh0Var4.o = floatValue4;
                org.telegram.ui.Cells.p2 p2Var4 = wh0Var4.H;
                if (p2Var4 != null) {
                    p2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var5 = this.b;
                wh0Var5.x = floatValue5;
                org.telegram.ui.Cells.p2 p2Var5 = wh0Var5.H;
                if (p2Var5 != null) {
                    p2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                wh0 wh0Var6 = this.b;
                wh0Var6.getClass();
                wh0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.p2 p2Var6 = wh0Var6.H;
                if (p2Var6 != null) {
                    p2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                wh0 wh0Var7 = this.b;
                wh0Var7.getClass();
                wh0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0Var7.F = true;
                org.telegram.ui.Cells.p2 p2Var7 = wh0Var7.H;
                if (p2Var7 != null) {
                    p2Var7.invalidate();
                    break;
                }
                break;
            default:
                wh0 wh0Var8 = this.b;
                wh0Var8.getClass();
                wh0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0Var8.F = false;
                org.telegram.ui.Cells.p2 p2Var8 = wh0Var8.H;
                if (p2Var8 != null) {
                    p2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
