package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lx0 b;

    public /* synthetic */ ix0(lx0 lx0Var, int i10) {
        this.a = i10;
        this.b = lx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                lx0 lx0Var = this.b;
                lx0Var.getClass();
                lx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.invalidate();
                break;
            case 1:
                lx0 lx0Var2 = this.b;
                lx0Var2.getClass();
                lx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                lx0 lx0Var3 = this.b;
                lx0Var3.getClass();
                lx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var3.invalidate();
                break;
        }
    }
}
