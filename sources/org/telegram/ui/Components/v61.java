package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class v61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ v61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w61 w61Var = (w61) this.b;
                w61Var.getClass();
                w61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.invalidate();
                break;
            case 1:
                c71 c71Var = (c71) this.b;
                c71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.b = floatValue;
                c71Var.setTranslationY(floatValue);
                break;
            default:
                y81 y81Var = (y81) this.b;
                y81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y81Var.setAnimationIdicatorProgress(floatValue2);
                x81 x81Var = y81Var.y;
                if (x81Var != null) {
                    ((ki.e0) x81Var).i(floatValue2);
                    break;
                }
                break;
        }
    }
}
