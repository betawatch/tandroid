package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ r51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t51 t51Var = (t51) this.b;
                t51Var.getClass();
                t51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t51Var.invalidate();
                break;
            case 1:
                j71 j71Var = (j71) this.b;
                j71Var.getClass();
                j71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.invalidate();
                break;
            case 2:
                p71 p71Var = (p71) this.b;
                p71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p71Var.b = floatValue;
                p71Var.setTranslationY(floatValue);
                break;
            default:
                k91 k91Var = (k91) this.b;
                k91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.setAnimationIdicatorProgress(floatValue2);
                j91 j91Var = k91Var.y;
                if (j91Var != null) {
                    ((m.h) j91Var).e(floatValue2);
                    break;
                }
                break;
        }
    }
}
