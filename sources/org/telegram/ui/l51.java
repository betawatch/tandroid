package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o51 b;

    public /* synthetic */ l51(o51 o51Var, int i10) {
        this.a = i10;
        this.b = o51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51 o51Var = this.b;
                o51Var.N = floatValue;
                o51Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51 o51Var2 = this.b;
                o51Var2.N = floatValue2;
                o51Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51 o51Var3 = this.b;
                o51Var3.N = floatValue3;
                o51Var3.V.h0.invalidate();
                break;
        }
    }
}
