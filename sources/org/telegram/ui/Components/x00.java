package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;

    public /* synthetic */ x00(y00 y00Var, int i10) {
        this.a = i10;
        this.b = y00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y00 y00Var = this.b;
                y00Var.getClass();
                y00Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                break;
            case 1:
                y00 y00Var2 = this.b;
                y00Var2.getClass();
                y00Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                y00Var2.invalidate();
                break;
            default:
                y00 y00Var3 = this.b;
                y00Var3.getClass();
                y00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var3.invalidate();
                break;
        }
    }
}
