package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ l51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m51 m51Var = (m51) this.b;
                m51Var.getClass();
                m51Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51Var.invalidate();
                break;
            case 1:
                s51 s51Var = (s51) this.b;
                s51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s51Var.b = floatValue;
                s51Var.setTranslationY(floatValue);
                break;
            default:
                o71 o71Var = (o71) this.b;
                o71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o71Var.setAnimationIdicatorProgress(floatValue2);
                n71 n71Var = o71Var.y;
                if (n71Var != null) {
                    ((m5.o) n71Var).x(floatValue2);
                    break;
                }
                break;
        }
    }
}
