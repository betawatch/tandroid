package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f61 f61Var = (f61) this.b;
                f61Var.getClass();
                f61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61Var.invalidate();
                break;
            case 1:
                m61 m61Var = (m61) this.b;
                m61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.b = floatValue;
                m61Var.setTranslationY(floatValue);
                break;
            default:
                h81 h81Var = (h81) this.b;
                h81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h81Var.setAnimationIdicatorProgress(floatValue2);
                g81 g81Var = h81Var.y;
                if (g81Var != null) {
                    ((k2.g0) g81Var).A(floatValue2);
                    break;
                }
                break;
        }
    }
}
