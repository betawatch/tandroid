package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ f2(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.getClass();
                q2Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                break;
            case 1:
                q2 q2Var2 = this.b;
                q2Var2.getClass();
                q2Var2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var2.invalidate();
                break;
            default:
                q2 q2Var3 = this.b;
                q2Var3.getClass();
                q2Var3.r4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var3.invalidate();
                break;
        }
    }
}
