package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b60 b;

    public /* synthetic */ w50(b60 b60Var, int i10) {
        this.a = i10;
        this.b = b60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b60 b60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b60Var.getMeasuredHeight() * 0.5f;
                b60Var.p0 = floatValue;
                b60Var.v.setTranslationY(floatValue + b60Var.o0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b60 b60Var2 = this.b;
                b60Var2.r0 = floatValue2;
                ki.s0 s0Var = b60Var2.P;
                if (s0Var != null) {
                    s0Var.v(floatValue2);
                    break;
                }
                break;
        }
    }
}
