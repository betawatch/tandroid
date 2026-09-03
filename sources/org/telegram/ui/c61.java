package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f61 b;

    public /* synthetic */ c61(f61 f61Var, int i10) {
        this.a = i10;
        this.b = f61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61 f61Var = this.b;
                f61Var.K = floatValue;
                f61Var.S.e0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61 f61Var2 = this.b;
                f61Var2.K = floatValue2;
                f61Var2.S.e0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61 f61Var3 = this.b;
                f61Var3.K = floatValue3;
                f61Var3.S.e0.invalidate();
                break;
        }
    }
}
