package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ si0 b;

    public /* synthetic */ qi0(si0 si0Var, int i10) {
        this.a = i10;
        this.b = si0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var = this.b;
                si0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = si0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                vl0 vl0Var = si0Var.I;
                if (vl0Var != null) {
                    vl0Var.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var2 = this.b;
                si0Var2.w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = si0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                vl0 vl0Var2 = si0Var2.I;
                if (vl0Var2 != null) {
                    vl0Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var3 = this.b;
                si0Var3.p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = si0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    break;
                }
                break;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var4 = this.b;
                si0Var4.o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = si0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    break;
                }
                break;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var5 = this.b;
                si0Var5.x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = si0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    break;
                }
                break;
            case 5:
                si0 si0Var6 = this.b;
                si0Var6.getClass();
                si0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = si0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    break;
                }
                break;
            case 6:
                si0 si0Var7 = this.b;
                si0Var7.getClass();
                si0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = si0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    break;
                }
                break;
            default:
                si0 si0Var8 = this.b;
                si0Var8.getClass();
                si0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = si0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    break;
                }
                break;
        }
    }
}
