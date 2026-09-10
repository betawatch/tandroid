package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d9 d9Var = this.d;
        d9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        lVar = ((org.telegram.ui.ActionBar.p2) d9Var).actionBar;
        lVar.getTitleTextView().setAlpha(d9Var.N);
        if (d9Var.F && !this.c) {
            d9Var.i0(1.0f - d9Var.N, false);
        }
        d9Var.r.setTranslationY(lerp);
        d9Var.x.setTranslationY(lerp);
        d9Var.fragmentView.invalidate();
        lVar2 = ((org.telegram.ui.ActionBar.p2) d9Var).actionBar;
        lVar2.invalidate();
    }
}
