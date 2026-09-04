package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o41 b;

    public /* synthetic */ l41(o41 o41Var, int i10) {
        this.a = i10;
        this.b = o41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o41 o41Var = this.b;
                o41Var.getClass();
                o41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var.g();
                break;
            case 1:
                o41 o41Var2 = this.b;
                o41Var2.getClass();
                o41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var2.g();
                break;
            default:
                o41 o41Var3 = this.b;
                o41Var3.getClass();
                o41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var3.g();
                break;
        }
    }
}
