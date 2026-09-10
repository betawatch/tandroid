package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ s61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t61 t61Var = (t61) this.b;
                t61Var.getClass();
                t61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t61Var.invalidate();
                break;
            case 1:
                z61 z61Var = (z61) this.b;
                z61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z61Var.b = floatValue;
                z61Var.setTranslationY(floatValue);
                break;
            default:
                u81 u81Var = (u81) this.b;
                u81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u81Var.setAnimationIdicatorProgress(floatValue2);
                t81 t81Var = u81Var.y;
                if (t81Var != null) {
                    ((l2.h) t81Var).z(floatValue2);
                    break;
                }
                break;
        }
    }
}
