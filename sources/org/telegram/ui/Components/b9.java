package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g9 d;

    public b9(g9 g9Var, float f7, float f10, boolean z10) {
        this.d = g9Var;
        this.a = f7;
        this.b = f10;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g9 g9Var = this.d;
        g9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) g9Var).actionBar;
        kVar.getTitleTextView().setAlpha(g9Var.N);
        if (g9Var.F && !this.c) {
            g9Var.i0(1.0f - g9Var.N, false);
        }
        g9Var.r.setTranslationY(lerp);
        g9Var.x.setTranslationY(lerp);
        g9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) g9Var).actionBar;
        kVar2.invalidate();
    }
}
