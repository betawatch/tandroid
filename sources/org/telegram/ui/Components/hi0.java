package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ji0 b;

    public /* synthetic */ hi0(ji0 ji0Var, int i10) {
        this.a = i10;
        this.b = ji0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var = this.b;
                ji0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = ji0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                ml0 ml0Var = ji0Var.I;
                if (ml0Var != null) {
                    ml0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var2 = this.b;
                ji0Var2.w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = ji0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                ml0 ml0Var2 = ji0Var2.I;
                if (ml0Var2 != null) {
                    ml0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var3 = this.b;
                ji0Var3.p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = ji0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var4 = this.b;
                ji0Var4.o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = ji0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var5 = this.b;
                ji0Var5.x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = ji0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ji0 ji0Var6 = this.b;
                ji0Var6.getClass();
                ji0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = ji0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ji0 ji0Var7 = this.b;
                ji0Var7.getClass();
                ji0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = ji0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    break;
                }
                break;
            default:
                ji0 ji0Var8 = this.b;
                ji0Var8.getClass();
                ji0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = ji0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
