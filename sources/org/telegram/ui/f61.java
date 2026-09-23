package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i61 b;

    public /* synthetic */ f61(i61 i61Var, int i10) {
        this.a = i10;
        this.b = i61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61 i61Var = this.b;
                i61Var.N = floatValue;
                i61Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61 i61Var2 = this.b;
                i61Var2.N = floatValue2;
                i61Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61 i61Var3 = this.b;
                i61Var3.N = floatValue3;
                i61Var3.V.h0.invalidate();
                break;
        }
    }
}
