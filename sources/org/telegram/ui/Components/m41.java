package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ m41(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n41 n41Var = (n41) this.b;
                n41Var.getClass();
                n41Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var.invalidate();
                break;
            case 1:
                t41 t41Var = (t41) this.b;
                t41Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t41Var.b = floatValue;
                t41Var.setTranslationY(floatValue);
                break;
            default:
                m61 m61Var = (m61) this.b;
                m61Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.setAnimationIdicatorProgress(floatValue2);
                l61 l61Var = m61Var.E;
                if (l61Var != null) {
                    ((y00) l61Var).x(floatValue2);
                    break;
                }
                break;
        }
    }
}
