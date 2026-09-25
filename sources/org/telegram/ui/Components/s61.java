package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                v81 v81Var = (v81) this.b;
                v81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v81Var.setAnimationIdicatorProgress(floatValue2);
                u81 u81Var = v81Var.y;
                if (u81Var != null) {
                    ((l.d) u81Var).L(floatValue2);
                    break;
                }
                break;
        }
    }
}
