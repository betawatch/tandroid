package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ u2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                z2 z2Var = w2Var.G;
                z2Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.h0();
                z2Var.q0(z2Var.b.getTranslationY());
                w2Var.invalidate();
                break;
            case 1:
                z2 z2Var2 = this.b.G;
                p2 p2Var = z2Var2.c;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                z2Var2.h0();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var2 = this.b;
                w2Var2.D = floatValue;
                z2 z2Var3 = w2Var2.G;
                z2Var3.b.setTranslationX(floatValue);
                z2Var3.c.invalidate();
                break;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var3 = this.b;
                w2Var3.D = floatValue2;
                z2 z2Var4 = w2Var3.G;
                z2Var4.b.setTranslationX(floatValue2);
                z2Var4.c.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2 z2Var5 = this.b.G;
                z2Var5.Y.setAlpha(z2Var5.o0 ? (int) (z2Var5.p0 * floatValue3) : 0);
                break;
        }
    }
}
