package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ v8 d;

    public q8(v8 v8Var, float f10, float f11, boolean z10) {
        this.d = v8Var;
        this.a = f10;
        this.b = f11;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v8 v8Var = this.d;
        v8Var.J = floatValue;
        float lerp = AndroidUtilities.lerp(this.a, this.b, floatValue);
        kVar = ((org.telegram.ui.ActionBar.n2) v8Var).actionBar;
        kVar.getTitleTextView().setAlpha(v8Var.J);
        if (v8Var.B && !this.c) {
            v8Var.i0(1.0f - v8Var.J, false);
        }
        v8Var.r.setTranslationY(lerp);
        v8Var.x.setTranslationY(lerp);
        v8Var.fragmentView.invalidate();
        kVar2 = ((org.telegram.ui.ActionBar.n2) v8Var).actionBar;
        kVar2.invalidate();
    }
}
