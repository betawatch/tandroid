package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;

    public /* synthetic */ nh0(qh0 qh0Var, int i10) {
        this.a = i10;
        this.b = qh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qh0 qh0Var = this.b;
                qh0Var.getClass();
                qh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh0Var.c(true);
                break;
            default:
                qh0 qh0Var2 = this.b;
                qh0Var2.getClass();
                qh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh0Var2.c(true);
                break;
        }
    }
}
