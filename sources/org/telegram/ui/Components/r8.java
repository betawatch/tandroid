package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ w8 d;

    public r8(w8 w8Var, float f10, float f11, boolean z10) {
        this.d = w8Var;
        this.a = f10;
        this.b = f11;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w8 w8Var = this.d;
        w8Var.J = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.o2) w8Var).actionBar;
        kVar.getTitleTextView().setAlpha(w8Var.J);
        if (w8Var.B && !this.c) {
            w8Var.h0(1.0f - w8Var.J, false);
        }
        w8Var.r.setTranslationY(lerp);
        w8Var.x.setTranslationY(lerp);
        w8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.o2) w8Var).actionBar;
        kVar2.invalidate();
    }
}
