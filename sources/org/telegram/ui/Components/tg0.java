package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ tg0(vg0 vg0Var, int i10) {
        this.a = i10;
        this.b = vg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vg0 vg0Var = this.b;
                vg0Var.getClass();
                vg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var.invalidate();
                break;
            default:
                vg0 vg0Var2 = this.b;
                vg0Var2.getClass();
                vg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var2.invalidate();
                break;
        }
    }
}
