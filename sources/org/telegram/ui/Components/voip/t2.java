package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ t2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var = this.b;
                v2Var.n = floatValue;
                v2Var.k.invalidate();
                if (v2Var.n > 1.0f && v2Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.i0.L(12), 0);
                    v2Var.r = ofInt;
                    ofInt.addUpdateListener(new t2(v2Var, 2));
                    v2Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    v2Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2 v2Var2 = this.b;
                v2Var2.m = intValue;
                v2Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2 v2Var3 = this.b;
                if (v2Var3.i <= v2Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                v2Var3.p = intValue2;
                v2Var3.k.invalidate();
                break;
        }
    }
}
