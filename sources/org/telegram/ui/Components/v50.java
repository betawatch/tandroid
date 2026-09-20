package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z50 b;

    public /* synthetic */ v50(z50 z50Var, int i10) {
        this.a = i10;
        this.b = z50Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z50 z50Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * z50Var.getMeasuredHeight() * 0.5f;
                z50Var.k0 = floatValue;
                z50Var.r.setTranslationY(floatValue + z50Var.j0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z50 z50Var2 = this.b;
                z50Var2.m0 = floatValue2;
                ki.o0 o0Var = z50Var2.K;
                if (o0Var != null) {
                    o0Var.v(floatValue2);
                    break;
                }
                break;
        }
    }
}
