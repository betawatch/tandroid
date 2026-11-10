package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ r2(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                w2 w2Var = t2Var.G;
                w2Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w2Var.h0();
                w2Var.q0(w2Var.b.getTranslationY());
                t2Var.invalidate();
                break;
            case 1:
                w2 w2Var2 = this.b.G;
                m2 m2Var = w2Var2.c;
                if (m2Var != null) {
                    m2Var.invalidate();
                }
                w2Var2.h0();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var2 = this.b;
                t2Var2.D = floatValue;
                w2 w2Var3 = t2Var2.G;
                w2Var3.b.setTranslationX(floatValue);
                w2Var3.c.invalidate();
                break;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var3 = this.b;
                t2Var3.D = floatValue2;
                w2 w2Var4 = t2Var3.G;
                w2Var4.b.setTranslationX(floatValue2);
                w2Var4.c.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var5 = this.b.G;
                w2Var5.Y.setAlpha(w2Var5.o0 ? (int) (w2Var5.p0 * floatValue3) : 0);
                break;
        }
    }
}
