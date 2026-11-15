package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o11 b;

    public /* synthetic */ m11(o11 o11Var, int i7) {
        this.a = i7;
        this.b = o11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o11 o11Var = this.b;
                o11Var.getClass();
                o11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.h();
                o11Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                o11 o11Var2 = this.b;
                o11Var2.M = max;
                o11Var2.h.invalidate();
                break;
        }
    }
}
