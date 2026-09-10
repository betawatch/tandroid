package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r41 b;

    public /* synthetic */ o41(r41 r41Var, int i10) {
        this.a = i10;
        this.b = r41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r41 r41Var = this.b;
                r41Var.getClass();
                r41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r41Var.g();
                break;
            case 1:
                r41 r41Var2 = this.b;
                r41Var2.getClass();
                r41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r41Var2.g();
                break;
            default:
                r41 r41Var3 = this.b;
                r41Var3.getClass();
                r41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r41Var3.g();
                break;
        }
    }
}
