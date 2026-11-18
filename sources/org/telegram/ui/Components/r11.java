package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u11 b;

    public /* synthetic */ r11(u11 u11Var, int i7) {
        this.a = i7;
        this.b = u11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fi.u2 u2Var = this.b.f;
                u2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.invalidate();
                break;
            default:
                u11 u11Var = this.b;
                u11Var.getClass();
                u11Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var.h();
                break;
        }
    }
}
