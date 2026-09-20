package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh0 b;

    public /* synthetic */ bh0(eh0 eh0Var, int i10) {
        this.a = i10;
        this.b = eh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                eh0 eh0Var = this.b;
                eh0Var.getClass();
                eh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh0Var.c(true);
                break;
            default:
                eh0 eh0Var2 = this.b;
                eh0Var2.getClass();
                eh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh0Var2.c(true);
                break;
        }
    }
}
