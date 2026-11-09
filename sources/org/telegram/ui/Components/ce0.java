package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ ce0(ee0 ee0Var, int i7) {
        this.a = i7;
        this.b = ee0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ee0 ee0Var = this.b;
                ee0Var.getClass();
                ee0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.invalidate();
                break;
            default:
                ee0 ee0Var2 = this.b;
                ee0Var2.getClass();
                ee0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var2.invalidate();
                break;
        }
    }
}
