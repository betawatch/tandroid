package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k10 b;

    public /* synthetic */ j10(k10 k10Var, int i10) {
        this.a = i10;
        this.b = k10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k10 k10Var = this.b;
                k10Var.getClass();
                k10Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k10Var.invalidate();
                break;
            case 1:
                k10 k10Var2 = this.b;
                k10Var2.getClass();
                k10Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k10Var2.invalidate();
                break;
            default:
                k10 k10Var3 = this.b;
                k10Var3.getClass();
                k10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k10Var3.invalidate();
                break;
        }
    }
}
