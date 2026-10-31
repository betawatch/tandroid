package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ l2(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2 z2Var = this.b;
                z2Var.C0 = floatValue;
                p2 p2Var = z2Var.c;
                if (p2Var != null) {
                    p2Var.invalidate();
                    break;
                }
                break;
            case 1:
                this.b.h0();
                break;
            case 2:
                this.b.h0();
                break;
            case 3:
                z2 z2Var2 = this.b;
                z2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var2.C0(z2Var2.X.intValue(), intValue, intValue);
                break;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2 z2Var3 = this.b;
                z2Var3.S0 = floatValue2;
                z2Var3.c.requestLayout();
                z2Var3.b.requestLayout();
                break;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2 z2Var4 = this.b;
                z2Var4.C0 = floatValue3;
                p2 p2Var2 = z2Var4.c;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                    break;
                }
                break;
            case 6:
                this.b.h0();
                break;
            default:
                this.b.h0();
                break;
        }
    }
}
