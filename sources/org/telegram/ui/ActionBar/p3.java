package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ p3(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                x3Var.getClass();
                x3Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.invalidate();
                break;
            case 1:
                x3 x3Var2 = this.b;
                x3Var2.getClass();
                x3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var2.invalidate();
                break;
            default:
                x3 x3Var3 = this.b;
                x3Var3.getClass();
                x3Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
