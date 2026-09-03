package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ u2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                v2Var.getClass();
                v2Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.a(v2Var.O, v2Var.P);
                break;
            default:
                v2 v2Var2 = this.b;
                v2Var2.getClass();
                v2Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.invalidate();
                break;
        }
    }
}
