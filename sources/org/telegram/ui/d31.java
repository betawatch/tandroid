package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g31 b;

    public /* synthetic */ d31(g31 g31Var, int i10) {
        this.a = i10;
        this.b = g31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g31 g31Var = this.b;
                g31Var.getClass();
                g31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var.g();
                break;
            case 1:
                g31 g31Var2 = this.b;
                g31Var2.getClass();
                g31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var2.g();
                break;
            default:
                g31 g31Var3 = this.b;
                g31Var3.getClass();
                g31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g31Var3.g();
                break;
        }
    }
}
