package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ h3(j3 j3Var, int i7) {
        this.a = i7;
        this.b = j3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3 j3Var = this.b;
                j3Var.n = floatValue;
                j3Var.k.invalidate();
                if (j3Var.n > 1.0f && j3Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    j3Var.r = ofInt;
                    ofInt.addUpdateListener(new h3(j3Var, 2));
                    j3Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    j3Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var2 = this.b;
                j3Var2.m = intValue;
                j3Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j3 j3Var3 = this.b;
                if (j3Var3.i <= j3Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                j3Var3.p = intValue2;
                j3Var3.k.invalidate();
                break;
        }
    }
}
