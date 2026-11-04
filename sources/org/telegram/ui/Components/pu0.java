package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ su0 b;

    public /* synthetic */ pu0(su0 su0Var, int i3) {
        this.a = i3;
        this.b = su0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                su0 su0Var = this.b;
                su0Var.getClass();
                su0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                su0Var.invalidate();
                break;
            case 1:
                su0 su0Var2 = this.b;
                su0Var2.getClass();
                su0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                su0 su0Var3 = this.b;
                su0Var3.getClass();
                su0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                su0Var3.invalidate();
                break;
        }
    }
}
