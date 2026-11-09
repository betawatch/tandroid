package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o40 b;

    public /* synthetic */ i40(o40 o40Var, int i7) {
        this.a = i7;
        this.b = o40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o40 o40Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * o40Var.getMeasuredHeight() * 0.5f;
                o40Var.x0 = floatValue;
                o40Var.s.setTranslationY(floatValue + o40Var.w0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o40 o40Var2 = this.b;
                o40Var2.z0 = floatValue2;
                wi.t0 t0Var = o40Var2.O;
                if (t0Var != null) {
                    t0Var.y(floatValue2);
                    break;
                }
                break;
        }
    }
}
