package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class z50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e60 b;

    public /* synthetic */ z50(e60 e60Var, int i10) {
        this.a = i10;
        this.b = e60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e60 e60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * e60Var.getMeasuredHeight() * 0.5f;
                e60Var.p0 = floatValue;
                e60Var.v.setTranslationY(floatValue + e60Var.o0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e60 e60Var2 = this.b;
                e60Var2.r0 = floatValue2;
                ki.s0 s0Var = e60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    break;
                }
                break;
        }
    }
}
