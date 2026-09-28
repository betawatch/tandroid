package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx0 b;

    public /* synthetic */ ax0(dx0 dx0Var, int i10) {
        this.a = i10;
        this.b = dx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dx0 dx0Var = this.b;
                dx0Var.getClass();
                dx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.invalidate();
                break;
            case 1:
                dx0 dx0Var2 = this.b;
                dx0Var2.getClass();
                dx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                dx0 dx0Var3 = this.b;
                dx0Var3.getClass();
                dx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var3.invalidate();
                break;
        }
    }
}
