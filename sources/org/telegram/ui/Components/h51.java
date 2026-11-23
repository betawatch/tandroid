package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ h51(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i51 i51Var = (i51) this.b;
                i51Var.getClass();
                i51Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51Var.invalidate();
                break;
            case 1:
                o51 o51Var = (o51) this.b;
                o51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.b = floatValue;
                o51Var.setTranslationY(floatValue);
                break;
            default:
                j71 j71Var = (j71) this.b;
                j71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.setAnimationIdicatorProgress(floatValue2);
                i71 i71Var = j71Var.E;
                if (i71Var != null) {
                    i71Var.c(floatValue2);
                    break;
                }
                break;
        }
    }
}
