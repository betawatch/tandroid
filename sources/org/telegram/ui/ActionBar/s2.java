package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ s2(u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                x2 x2Var = u2Var.H;
                x2Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x2Var.h0();
                x2Var.q0(x2Var.b.getTranslationY());
                u2Var.invalidate();
                break;
            case 1:
                x2 x2Var2 = this.b.H;
                n2 n2Var = x2Var2.c;
                if (n2Var != null) {
                    n2Var.invalidate();
                }
                x2Var2.h0();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var2 = this.b;
                u2Var2.E = floatValue;
                x2 x2Var3 = u2Var2.H;
                x2Var3.b.setTranslationX(floatValue);
                x2Var3.c.invalidate();
                break;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var3 = this.b;
                u2Var3.E = floatValue2;
                x2 x2Var4 = u2Var3.H;
                x2Var4.b.setTranslationX(floatValue2);
                x2Var4.c.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var5 = this.b.H;
                x2Var5.Z.setAlpha(x2Var5.p0 ? (int) (x2Var5.q0 * floatValue3) : 0);
                break;
        }
    }
}
