package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class er0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr0 b;

    public /* synthetic */ er0(nr0 nr0Var, int i7) {
        this.a = i7;
        this.b = nr0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                nr0 nr0Var = this.b;
                nr0Var.getClass();
                nr0Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                nr0 nr0Var2 = this.b;
                nr0Var2.getClass();
                nr0Var2.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
