package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ re0 b;

    public /* synthetic */ pe0(re0 re0Var, int i7) {
        this.a = i7;
        this.b = re0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                re0 re0Var = this.b;
                re0Var.getClass();
                re0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re0Var.invalidate();
                break;
            default:
                re0 re0Var2 = this.b;
                re0Var2.getClass();
                re0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re0Var2.invalidate();
                break;
        }
    }
}
