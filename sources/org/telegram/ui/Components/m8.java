package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ r8 d;

    public m8(r8 r8Var, float f10, float f11, boolean z10) {
        this.d = r8Var;
        this.a = f10;
        this.b = f11;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        r8 r8Var = this.d;
        r8Var.O = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.d2) r8Var).actionBar;
        kVar.getTitleTextView().setAlpha(r8Var.O);
        if (r8Var.G && !this.c) {
            r8Var.n0(false, 1.0f - r8Var.O);
        }
        r8Var.r.setTranslationY(T1);
        r8Var.y.setTranslationY(T1);
        r8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.d2) r8Var).actionBar;
        kVar2.invalidate();
    }
}
