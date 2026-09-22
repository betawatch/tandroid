package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b60 b;

    public /* synthetic */ v50(b60 b60Var, int i10) {
        this.a = i10;
        this.b = b60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b60 b60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b60Var.getMeasuredHeight() * 0.5f;
                b60Var.m0 = floatValue;
                b60Var.v.setTranslationY(floatValue + b60Var.l0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b60 b60Var2 = this.b;
                b60Var2.o0 = floatValue2;
                ki.q0 q0Var = b60Var2.M;
                if (q0Var != null) {
                    q0Var.v(floatValue2);
                    break;
                }
                break;
        }
    }
}
