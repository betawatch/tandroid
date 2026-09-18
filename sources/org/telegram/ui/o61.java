package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r61 b;

    public /* synthetic */ o61(r61 r61Var, int i10) {
        this.a = i10;
        this.b = r61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61 r61Var = this.b;
                r61Var.N = floatValue;
                r61Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61 r61Var2 = this.b;
                r61Var2.N = floatValue2;
                r61Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61 r61Var3 = this.b;
                r61Var3.N = floatValue3;
                r61Var3.V.h0.invalidate();
                break;
        }
    }
}
