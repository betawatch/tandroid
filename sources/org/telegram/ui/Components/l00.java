package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m00 b;

    public /* synthetic */ l00(m00 m00Var, int i10) {
        this.a = i10;
        this.b = m00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m00 m00Var = this.b;
                m00Var.getClass();
                m00Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m00Var.invalidate();
                break;
            case 1:
                m00 m00Var2 = this.b;
                m00Var2.getClass();
                m00Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m00Var2.invalidate();
                break;
            default:
                m00 m00Var3 = this.b;
                m00Var3.getClass();
                m00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m00Var3.invalidate();
                break;
        }
    }
}
