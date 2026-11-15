package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ q2(r2 r2Var, int i7) {
        this.a = i7;
        this.b = r2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.getClass();
                r2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.a(r2Var.S, r2Var.T);
                break;
            default:
                r2 r2Var2 = this.b;
                r2Var2.getClass();
                r2Var2.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.invalidate();
                break;
        }
    }
}
