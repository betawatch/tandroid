package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ h2(w2 w2Var, int i7) {
        this.a = i7;
        this.b = w2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var = this.b;
                w2Var.C0 = floatValue;
                m2 m2Var = w2Var.c;
                if (m2Var != null) {
                    m2Var.invalidate();
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
                w2 w2Var2 = this.b;
                w2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2Var2.C0(w2Var2.X.intValue(), intValue, intValue);
                break;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var3 = this.b;
                w2Var3.S0 = floatValue2;
                w2Var3.c.requestLayout();
                w2Var3.b.requestLayout();
                break;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var4 = this.b;
                w2Var4.C0 = floatValue3;
                m2 m2Var2 = w2Var4.c;
                if (m2Var2 != null) {
                    m2Var2.invalidate();
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
