package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ q2(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                v2 v2Var = s2Var.G;
                v2Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v2Var.h0();
                v2Var.q0(v2Var.b.getTranslationY());
                s2Var.invalidate();
                break;
            case 1:
                v2 v2Var2 = this.b.G;
                l2 l2Var = v2Var2.c;
                if (l2Var != null) {
                    l2Var.invalidate();
                }
                v2Var2.h0();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2 s2Var2 = this.b;
                s2Var2.D = floatValue;
                v2 v2Var3 = s2Var2.G;
                v2Var3.b.setTranslationX(floatValue);
                v2Var3.c.invalidate();
                break;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2 s2Var3 = this.b;
                s2Var3.D = floatValue2;
                v2 v2Var4 = s2Var3.G;
                v2Var4.b.setTranslationX(floatValue2);
                v2Var4.c.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var5 = this.b.G;
                v2Var5.Y.setAlpha(v2Var5.o0 ? (int) (v2Var5.p0 * floatValue3) : 0);
                break;
        }
    }
}
