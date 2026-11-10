package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ s8 d;

    public n8(s8 s8Var, float f10, float f11, boolean z9) {
        this.d = s8Var;
        this.a = f10;
        this.b = f11;
        this.c = z9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        s8 s8Var = this.d;
        s8Var.N = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.a, this.b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.f2) s8Var).actionBar;
        lVar.getTitleTextView().setAlpha(s8Var.N);
        if (s8Var.F && !this.c) {
            s8Var.n0(false, 1.0f - s8Var.N);
        }
        s8Var.r.setTranslationY(T1);
        s8Var.y.setTranslationY(T1);
        s8Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.f2) s8Var).actionBar;
        lVar2.invalidate();
    }
}
