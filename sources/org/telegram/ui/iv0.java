package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ iv0(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rv0 rv0Var = this.b;
                rv0Var.getClass();
                rv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                rv0 rv0Var2 = this.b;
                rv0Var2.getClass();
                rv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
