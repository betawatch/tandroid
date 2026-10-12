package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class q51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ q51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s51 s51Var = (s51) this.b;
                s51Var.getClass();
                s51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s51Var.invalidate();
                break;
            case 1:
                i71 i71Var = (i71) this.b;
                i71Var.getClass();
                i71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i71Var.invalidate();
                break;
            case 2:
                o71 o71Var = (o71) this.b;
                o71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o71Var.b = floatValue;
                o71Var.setTranslationY(floatValue);
                break;
            default:
                j91 j91Var = (j91) this.b;
                j91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j91Var.setAnimationIdicatorProgress(floatValue2);
                i91 i91Var = j91Var.y;
                if (i91Var != null) {
                    ((l2.f) i91Var).j(floatValue2);
                    break;
                }
                break;
        }
    }
}
