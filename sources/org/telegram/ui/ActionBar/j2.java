package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ j2(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var = this.b;
                x2Var.D0 = floatValue;
                n2 n2Var = x2Var.c;
                if (n2Var != null) {
                    n2Var.invalidate();
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
                x2 x2Var2 = this.b;
                x2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var2.C0(x2Var2.Y.intValue(), intValue, intValue);
                break;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var3 = this.b;
                x2Var3.T0 = floatValue2;
                x2Var3.c.requestLayout();
                x2Var3.b.requestLayout();
                break;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var4 = this.b;
                x2Var4.D0 = floatValue3;
                n2 n2Var2 = x2Var4.c;
                if (n2Var2 != null) {
                    n2Var2.invalidate();
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
