package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class te0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ we0 b;

    public /* synthetic */ te0(we0 we0Var, int i7) {
        this.a = i7;
        this.b = we0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                we0 we0Var = this.b;
                we0Var.getClass();
                we0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we0Var.c(true);
                break;
            default:
                we0 we0Var2 = this.b;
                we0Var2.getClass();
                we0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we0Var2.c(true);
                break;
        }
    }
}
