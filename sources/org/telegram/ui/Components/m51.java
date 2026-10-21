package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ m51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o51 o51Var = (o51) this.b;
                o51Var.getClass();
                o51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.invalidate();
                break;
            case 1:
                d71 d71Var = (d71) this.b;
                d71Var.getClass();
                d71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d71Var.invalidate();
                break;
            case 2:
                j71 j71Var = (j71) this.b;
                j71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.b = floatValue;
                j71Var.setTranslationY(floatValue);
                break;
            default:
                d91 d91Var = (d91) this.b;
                d91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d91Var.setAnimationIdicatorProgress(floatValue2);
                c91 c91Var = d91Var.y;
                if (c91Var != null) {
                    ((l2.f) c91Var).I(floatValue2);
                    break;
                }
                break;
        }
    }
}
