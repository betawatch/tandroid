package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ gf0(jf0 jf0Var, int i7) {
        this.a = i7;
        this.b = jf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jf0 jf0Var = this.b;
                jf0Var.getClass();
                jf0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf0Var.c(true);
                break;
            default:
                jf0 jf0Var2 = this.b;
                jf0Var2.getClass();
                jf0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf0Var2.c(true);
                break;
        }
    }
}
