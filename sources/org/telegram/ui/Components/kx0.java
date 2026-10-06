package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ kx0(nx0 nx0Var, int i10) {
        this.a = i10;
        this.b = nx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                nx0 nx0Var = this.b;
                nx0Var.getClass();
                nx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.invalidate();
                break;
            case 1:
                nx0 nx0Var2 = this.b;
                nx0Var2.getClass();
                nx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                nx0 nx0Var3 = this.b;
                nx0Var3.getClass();
                nx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var3.invalidate();
                break;
        }
    }
}
