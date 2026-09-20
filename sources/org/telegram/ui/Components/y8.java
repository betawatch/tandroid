package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class y8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ d9 d;

    public y8(d9 d9Var, float f7, float f10, boolean z10) {
        this.d = d9Var;
        this.a = f7;
        this.b = f10;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d9 d9Var = this.d;
        d9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) d9Var).actionBar;
        kVar.getTitleTextView().setAlpha(d9Var.N);
        if (d9Var.F && !this.c) {
            d9Var.i0(1.0f - d9Var.N, false);
        }
        d9Var.r.setTranslationY(lerp);
        d9Var.x.setTranslationY(lerp);
        d9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) d9Var).actionBar;
        kVar2.invalidate();
    }
}
