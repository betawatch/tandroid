package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f9 d;

    public a9(f9 f9Var, float f7, float f10, boolean z10) {
        this.d = f9Var;
        this.a = f7;
        this.b = f10;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f9 f9Var = this.d;
        f9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
        kVar.getTitleTextView().setAlpha(f9Var.N);
        if (f9Var.F && !this.c) {
            f9Var.i0(1.0f - f9Var.N, false);
        }
        f9Var.r.setTranslationY(lerp);
        f9Var.x.setTranslationY(lerp);
        f9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) f9Var).actionBar;
        kVar2.invalidate();
    }
}
