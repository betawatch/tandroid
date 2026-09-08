package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                r2Var.R3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                break;
            case 1:
                r2 r2Var2 = this.b;
                r2Var2.getClass();
                r2Var2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                break;
            default:
                r2 r2Var3 = this.b;
                r2Var3.getClass();
                r2Var3.u4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var3.invalidate();
                break;
        }
    }
}
