package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;

    public /* synthetic */ s40(y40 y40Var, int i7) {
        this.a = i7;
        this.b = y40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y40 y40Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * y40Var.getMeasuredHeight() * 0.5f;
                y40Var.y0 = floatValue;
                y40Var.s.setTranslationY(floatValue + y40Var.x0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y40 y40Var2 = this.b;
                y40Var2.A0 = floatValue2;
                zi.u0 u0Var = y40Var2.P;
                if (u0Var != null) {
                    u0Var.y(floatValue2);
                    break;
                }
                break;
        }
    }
}
