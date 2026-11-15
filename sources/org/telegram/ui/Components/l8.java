package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q8 d;

    public l8(q8 q8Var, float f10, float f11, boolean z10) {
        this.d = q8Var;
        this.a = f10;
        this.b = f11;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        q8 q8Var = this.d;
        q8Var.O = floatValue;
        float T1 = org.telegram.messenger.g0.T1(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.e2) q8Var).actionBar;
        kVar.getTitleTextView().setAlpha(q8Var.O);
        if (q8Var.G && !this.c) {
            q8Var.n0(false, 1.0f - q8Var.O);
        }
        q8Var.r.setTranslationY(T1);
        q8Var.y.setTranslationY(T1);
        q8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.e2) q8Var).actionBar;
        kVar2.invalidate();
    }
}
