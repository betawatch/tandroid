package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ eg0(hg0 hg0Var, int i10) {
        this.a = i10;
        this.b = hg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                hg0 hg0Var = this.b;
                hg0Var.getClass();
                hg0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var.c(true);
                break;
            default:
                hg0 hg0Var2 = this.b;
                hg0Var2.getClass();
                hg0Var2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var2.c(true);
                break;
        }
    }
}
