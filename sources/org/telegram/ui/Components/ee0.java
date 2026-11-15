package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;

    public /* synthetic */ ee0(ge0 ge0Var, int i7) {
        this.a = i7;
        this.b = ge0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ge0 ge0Var = this.b;
                ge0Var.getClass();
                ge0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ge0Var.invalidate();
                break;
            default:
                ge0 ge0Var2 = this.b;
                ge0Var2.getClass();
                ge0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ge0Var2.invalidate();
                break;
        }
    }
}
