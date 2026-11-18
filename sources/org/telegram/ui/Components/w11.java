package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y11 b;

    public /* synthetic */ w11(y11 y11Var, int i7) {
        this.a = i7;
        this.b = y11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y11 y11Var = this.b;
                y11Var.getClass();
                y11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.h();
                y11Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                y11 y11Var2 = this.b;
                y11Var2.M = max;
                y11Var2.h.invalidate();
                break;
        }
    }
}
