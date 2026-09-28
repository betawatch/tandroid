package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a10 b;

    public /* synthetic */ z00(a10 a10Var, int i10) {
        this.a = i10;
        this.b = a10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a10 a10Var = this.b;
                a10Var.getClass();
                a10Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                break;
            case 1:
                a10 a10Var2 = this.b;
                a10Var2.getClass();
                a10Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a10Var2.invalidate();
                break;
            default:
                a10 a10Var3 = this.b;
                a10Var3.getClass();
                a10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var3.invalidate();
                break;
        }
    }
}
