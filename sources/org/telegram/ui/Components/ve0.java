package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye0 b;

    public /* synthetic */ ve0(ye0 ye0Var, int i7) {
        this.a = i7;
        this.b = ye0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ye0 ye0Var = this.b;
                ye0Var.getClass();
                ye0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye0Var.c(true);
                break;
            default:
                ye0 ye0Var2 = this.b;
                ye0Var2.getClass();
                ye0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye0Var2.c(true);
                break;
        }
    }
}
