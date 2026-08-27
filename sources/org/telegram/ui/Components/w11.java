package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y11 b;

    public /* synthetic */ w11(y11 y11Var, int i10) {
        this.a = i10;
        this.b = y11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jh.a3 a3Var = this.b.f;
                a3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                a3Var.invalidate();
                break;
            default:
                y11 y11Var = this.b;
                y11Var.getClass();
                y11Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.h();
                break;
        }
    }
}
