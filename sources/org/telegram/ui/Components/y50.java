package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ y50(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d60 d60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * d60Var.getMeasuredHeight() * 0.5f;
                d60Var.p0 = floatValue;
                d60Var.v.setTranslationY(floatValue + d60Var.o0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60 d60Var2 = this.b;
                d60Var2.r0 = floatValue2;
                ki.s0 s0Var = d60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    break;
                }
                break;
        }
    }
}
