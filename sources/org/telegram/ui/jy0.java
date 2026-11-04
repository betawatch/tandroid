package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ jy0(my0 my0Var, int i3) {
        this.a = i3;
        this.b = my0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                my0 my0Var = this.b;
                my0Var.getClass();
                my0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my0Var.g();
                break;
            case 1:
                my0 my0Var2 = this.b;
                my0Var2.getClass();
                my0Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my0Var2.g();
                break;
            default:
                my0 my0Var3 = this.b;
                my0Var3.getClass();
                my0Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my0Var3.g();
                break;
        }
    }
}
