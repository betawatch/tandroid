package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a60 b;

    public /* synthetic */ v50(a60 a60Var, int i10) {
        this.a = i10;
        this.b = a60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a60 a60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * a60Var.getMeasuredHeight() * 0.5f;
                a60Var.h0 = floatValue;
                a60Var.r.setTranslationY(floatValue + a60Var.g0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a60 a60Var2 = this.b;
                a60Var2.j0 = floatValue2;
                ki.h0 h0Var = a60Var2.J;
                if (h0Var != null) {
                    h0Var.w(floatValue2);
                    break;
                }
                break;
        }
    }
}
