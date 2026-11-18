package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe0 b;

    public /* synthetic */ oe0(qe0 qe0Var, int i7) {
        this.a = i7;
        this.b = qe0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qe0 qe0Var = this.b;
                qe0Var.getClass();
                qe0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe0Var.invalidate();
                break;
            default:
                qe0 qe0Var2 = this.b;
                qe0Var2.getClass();
                qe0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe0Var2.invalidate();
                break;
        }
    }
}
