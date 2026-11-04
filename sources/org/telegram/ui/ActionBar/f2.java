package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ f2(t2 t2Var, int i3) {
        this.a = i3;
        this.b = t2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var = this.b;
                t2Var.D0 = floatValue;
                j2 j2Var = t2Var.c;
                if (j2Var != null) {
                    j2Var.invalidate();
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
                t2 t2Var2 = this.b;
                t2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                t2Var2.C0(t2Var2.Y.intValue(), intValue, intValue);
                break;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var3 = this.b;
                t2Var3.T0 = floatValue2;
                t2Var3.c.requestLayout();
                t2Var3.b.requestLayout();
                break;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var4 = this.b;
                t2Var4.D0 = floatValue3;
                j2 j2Var2 = t2Var4.c;
                if (j2Var2 != null) {
                    j2Var2.invalidate();
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
