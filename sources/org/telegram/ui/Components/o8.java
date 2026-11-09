package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ t8 d;

    public o8(t8 t8Var, float f10, float f11, boolean z9) {
        this.d = t8Var;
        this.a = f10;
        this.b = f11;
        this.c = z9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t8 t8Var = this.d;
        t8Var.N = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.f2) t8Var).actionBar;
        kVar.getTitleTextView().setAlpha(t8Var.N);
        if (t8Var.F && !this.c) {
            t8Var.n0(false, 1.0f - t8Var.N);
        }
        t8Var.r.setTranslationY(T1);
        t8Var.y.setTranslationY(T1);
        t8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.f2) t8Var).actionBar;
        kVar2.invalidate();
    }
}
