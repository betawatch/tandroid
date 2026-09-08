package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
