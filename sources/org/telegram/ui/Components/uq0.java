package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class uq0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr0 b;
    public final /* synthetic */ ys0 c;

    public /* synthetic */ uq0(ys0 ys0Var, tr0 tr0Var, int i7) {
        this.a = i7;
        this.c = ys0Var;
        this.b = tr0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.c.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
            default:
                this.c.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
        }
    }
}
