package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ x8 d;

    public s8(x8 x8Var, float f10, float f11, boolean z10) {
        this.d = x8Var;
        this.a = f10;
        this.b = f11;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x8 x8Var = this.d;
        x8Var.O = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.g2) x8Var).actionBar;
        kVar.getTitleTextView().setAlpha(x8Var.O);
        if (x8Var.G && !this.c) {
            x8Var.n0(false, 1.0f - x8Var.O);
        }
        x8Var.r.setTranslationY(T1);
        x8Var.y.setTranslationY(T1);
        x8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.g2) x8Var).actionBar;
        kVar2.invalidate();
    }
}
