package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p61 b;

    public /* synthetic */ m61(p61 p61Var, int i10) {
        this.a = i10;
        this.b = p61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61 p61Var = this.b;
                p61Var.N = floatValue;
                p61Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61 p61Var2 = this.b;
                p61Var2.N = floatValue2;
                p61Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61 p61Var3 = this.b;
                p61Var3.N = floatValue3;
                p61Var3.V.h0.invalidate();
                break;
        }
    }
}
