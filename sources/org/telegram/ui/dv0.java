package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv0 b;

    public /* synthetic */ dv0(mv0 mv0Var, int i10) {
        this.a = i10;
        this.b = mv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                mv0 mv0Var = this.b;
                mv0Var.getClass();
                mv0Var.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                mv0 mv0Var2 = this.b;
                mv0Var2.getClass();
                mv0Var2.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
