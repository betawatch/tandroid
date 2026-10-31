package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o8 d;

    public j8(o8 o8Var, float f7, float f10, boolean z10) {
        this.d = o8Var;
        this.a = f7;
        this.b = f10;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o8 o8Var = this.d;
        o8Var.N = floatValue;
        float T1 = org.telegram.messenger.i0.T1(this.a, this.b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.k2) o8Var).actionBar;
        lVar.getTitleTextView().setAlpha(o8Var.N);
        if (o8Var.F && !this.c) {
            o8Var.m0(false, 1.0f - o8Var.N);
        }
        o8Var.r.setTranslationY(T1);
        o8Var.y.setTranslationY(T1);
        o8Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.k2) o8Var).actionBar;
        lVar2.invalidate();
    }
}
