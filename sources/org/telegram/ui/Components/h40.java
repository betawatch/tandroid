package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n40 b;

    public /* synthetic */ h40(n40 n40Var, int i7) {
        this.a = i7;
        this.b = n40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n40 n40Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * n40Var.getMeasuredHeight() * 0.5f;
                n40Var.w0 = floatValue;
                n40Var.s.setTranslationY(floatValue + n40Var.v0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n40 n40Var2 = this.b;
                n40Var2.y0 = floatValue2;
                wi.t0 t0Var = n40Var2.O;
                if (t0Var != null) {
                    t0Var.x(floatValue2);
                    break;
                }
                break;
        }
    }
}
