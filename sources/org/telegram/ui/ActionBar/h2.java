package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ h2(v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var = this.b;
                v2Var.C0 = floatValue;
                l2 l2Var = v2Var.c;
                if (l2Var != null) {
                    l2Var.invalidate();
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
                v2 v2Var2 = this.b;
                v2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var2.C0(v2Var2.X.intValue(), intValue, intValue);
                break;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var3 = this.b;
                v2Var3.S0 = floatValue2;
                v2Var3.c.requestLayout();
                v2Var3.b.requestLayout();
                break;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var4 = this.b;
                v2Var4.C0 = floatValue3;
                l2 l2Var2 = v2Var4.c;
                if (l2Var2 != null) {
                    l2Var2.invalidate();
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
