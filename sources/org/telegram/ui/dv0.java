package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
