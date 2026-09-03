package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ g2(r2 r2Var, int i10) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.getClass();
                r2Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                break;
            case 1:
                r2 r2Var2 = this.b;
                r2Var2.getClass();
                r2Var2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                break;
            default:
                r2 r2Var3 = this.b;
                r2Var3.getClass();
                r2Var3.r4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var3.invalidate();
                break;
        }
    }
}
