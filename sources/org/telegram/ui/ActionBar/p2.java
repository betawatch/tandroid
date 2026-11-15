package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ p2(r2 r2Var, int i7) {
        this.a = i7;
        this.b = r2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                u2 u2Var = r2Var.H;
                u2Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u2Var.h0();
                u2Var.q0(u2Var.b.getTranslationY());
                r2Var.invalidate();
                break;
            case 1:
                u2 u2Var2 = this.b.H;
                k2 k2Var = u2Var2.c;
                if (k2Var != null) {
                    k2Var.invalidate();
                }
                u2Var2.h0();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2 r2Var2 = this.b;
                r2Var2.E = floatValue;
                u2 u2Var3 = r2Var2.H;
                u2Var3.b.setTranslationX(floatValue);
                u2Var3.c.invalidate();
                break;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2 r2Var3 = this.b;
                r2Var3.E = floatValue2;
                u2 u2Var4 = r2Var3.H;
                u2Var4.b.setTranslationX(floatValue2);
                u2Var4.c.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var5 = this.b.H;
                u2Var5.Z.setAlpha(u2Var5.p0 ? (int) (u2Var5.q0 * floatValue3) : 0);
                break;
        }
    }
}
