package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ u51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w51 w51Var = (w51) this.b;
                w51Var.getClass();
                w51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.invalidate();
                break;
            case 1:
                l71 l71Var = (l71) this.b;
                l71Var.getClass();
                l71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var.invalidate();
                break;
            case 2:
                r71 r71Var = (r71) this.b;
                r71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r71Var.b = floatValue;
                r71Var.setTranslationY(floatValue);
                break;
            default:
                n91 n91Var = (n91) this.b;
                n91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n91Var.setAnimationIdicatorProgress(floatValue2);
                m91 m91Var = n91Var.y;
                if (m91Var != null) {
                    ((m2.t) m91Var).D(floatValue2);
                    break;
                }
                break;
        }
    }
}
