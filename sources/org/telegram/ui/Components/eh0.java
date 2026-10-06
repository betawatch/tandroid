package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh0 b;

    public /* synthetic */ eh0(hh0 hh0Var, int i10) {
        this.a = i10;
        this.b = hh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                hh0 hh0Var = this.b;
                hh0Var.getClass();
                hh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh0Var.c(true);
                break;
            default:
                hh0 hh0Var2 = this.b;
                hh0Var2.getClass();
                hh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh0Var2.c(true);
                break;
        }
    }
}
