package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class p61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s61 b;

    public /* synthetic */ p61(s61 s61Var, int i10) {
        this.a = i10;
        this.b = s61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var = this.b;
                s61Var.N = floatValue;
                s61Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var2 = this.b;
                s61Var2.N = floatValue2;
                s61Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61 s61Var3 = this.b;
                s61Var3.N = floatValue3;
                s61Var3.V.h0.invalidate();
                break;
        }
    }
}
