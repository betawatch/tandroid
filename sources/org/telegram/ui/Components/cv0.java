package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv0 b;

    public /* synthetic */ cv0(fv0 fv0Var, int i7) {
        this.a = i7;
        this.b = fv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fv0 fv0Var = this.b;
                fv0Var.getClass();
                fv0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                break;
            case 1:
                fv0 fv0Var2 = this.b;
                fv0Var2.getClass();
                fv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                fv0 fv0Var3 = this.b;
                fv0Var3.getClass();
                fv0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var3.invalidate();
                break;
        }
    }
}
