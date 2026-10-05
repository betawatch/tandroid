package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ f71(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g71 g71Var = (g71) this.b;
                g71Var.getClass();
                g71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var.invalidate();
                break;
            case 1:
                m71 m71Var = (m71) this.b;
                m71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m71Var.b = floatValue;
                m71Var.setTranslationY(floatValue);
                break;
            default:
                g91 g91Var = (g91) this.b;
                g91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g91Var.setAnimationIdicatorProgress(floatValue2);
                f91 f91Var = g91Var.y;
                if (f91Var != null) {
                    ((n2.c) f91Var).k(floatValue2);
                    break;
                }
                break;
        }
    }
}
