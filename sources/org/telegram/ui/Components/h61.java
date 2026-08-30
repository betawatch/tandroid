package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ h61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i61 i61Var = (i61) this.b;
                i61Var.getClass();
                i61Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i61Var.invalidate();
                break;
            case 1:
                o61 o61Var = (o61) this.b;
                o61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o61Var.b = floatValue;
                o61Var.setTranslationY(floatValue);
                break;
            default:
                k81 k81Var = (k81) this.b;
                k81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k81Var.setAnimationIdicatorProgress(floatValue2);
                j81 j81Var = k81Var.y;
                if (j81Var != null) {
                    ((o2.o) j81Var).q(floatValue2);
                    break;
                }
                break;
        }
    }
}
