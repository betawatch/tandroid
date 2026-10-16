package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h9 d;

    public c9(h9 h9Var, float f7, float f10, boolean z10) {
        this.d = h9Var;
        this.a = f7;
        this.b = f10;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        h9 h9Var = this.d;
        h9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.m2) h9Var).actionBar;
        kVar.getTitleTextView().setAlpha(h9Var.N);
        if (h9Var.F && !this.c) {
            h9Var.i0(1.0f - h9Var.N, false);
        }
        h9Var.r.setTranslationY(lerp);
        h9Var.x.setTranslationY(lerp);
        h9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.m2) h9Var).actionBar;
        kVar2.invalidate();
    }
}
