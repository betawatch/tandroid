package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c9 d;

    public x8(c9 c9Var, float f7, float f10, boolean z10) {
        this.d = c9Var;
        this.a = f7;
        this.b = f10;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c9 c9Var = this.d;
        c9Var.N = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.o2) c9Var).actionBar;
        kVar.getTitleTextView().setAlpha(c9Var.N);
        if (c9Var.F && !this.c) {
            c9Var.i0(1.0f - c9Var.N, false);
        }
        c9Var.r.setTranslationY(lerp);
        c9Var.x.setTranslationY(lerp);
        c9Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.o2) c9Var).actionBar;
        kVar2.invalidate();
    }
}
