package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ o2(q2 q2Var, int i3) {
        this.a = i3;
        this.b = q2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                t2 t2Var = q2Var.H;
                t2Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                t2Var.h0();
                t2Var.q0(t2Var.b.getTranslationY());
                q2Var.invalidate();
                break;
            case 1:
                t2 t2Var2 = this.b.H;
                j2 j2Var = t2Var2.c;
                if (j2Var != null) {
                    j2Var.invalidate();
                }
                t2Var2.h0();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2 q2Var2 = this.b;
                q2Var2.E = floatValue;
                t2 t2Var3 = q2Var2.H;
                t2Var3.b.setTranslationX(floatValue);
                t2Var3.c.invalidate();
                break;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2 q2Var3 = this.b;
                q2Var3.E = floatValue2;
                t2 t2Var4 = q2Var3.H;
                t2Var4.b.setTranslationX(floatValue2);
                t2Var4.c.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var5 = this.b.H;
                t2Var5.Z.setAlpha(t2Var5.p0 ? (int) (t2Var5.q0 * floatValue3) : 0);
                break;
        }
    }
}
