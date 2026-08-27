package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c21 b;

    public /* synthetic */ a21(c21 c21Var, int i10) {
        this.a = i10;
        this.b = c21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c21 c21Var = this.b;
                c21Var.getClass();
                c21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c21Var.h();
                c21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c21 c21Var2 = this.b;
                c21Var2.G = max;
                c21Var2.h.invalidate();
                break;
        }
    }
}
