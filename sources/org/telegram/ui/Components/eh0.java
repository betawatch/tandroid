package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
