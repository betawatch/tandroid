package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ s2(u2 u2Var, int i3) {
        this.a = i3;
        this.b = u2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var = this.b;
                u2Var.n = floatValue;
                u2Var.k.invalidate();
                if (u2Var.n > 1.0f && u2Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    u2Var.r = ofInt;
                    ofInt.addUpdateListener(new s2(u2Var, 2));
                    u2Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    u2Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2 u2Var2 = this.b;
                u2Var2.m = intValue;
                u2Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2 u2Var3 = this.b;
                if (u2Var3.i <= u2Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                u2Var3.p = intValue2;
                u2Var3.k.invalidate();
                break;
        }
    }
}
