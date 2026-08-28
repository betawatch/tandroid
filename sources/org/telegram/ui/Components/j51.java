package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ j51(int i9, View view) {
        this.a = i9;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k51 k51Var = (k51) this.b;
                k51Var.getClass();
                k51Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51Var.invalidate();
                break;
            case 1:
                q51 q51Var = (q51) this.b;
                q51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q51Var.b = floatValue;
                q51Var.setTranslationY(floatValue);
                break;
            default:
                m71 m71Var = (m71) this.b;
                m71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m71Var.setAnimationIdicatorProgress(floatValue2);
                l71 l71Var = m71Var.y;
                if (l71Var != null) {
                    ((n2.p) l71Var).F(floatValue2);
                    break;
                }
                break;
        }
    }
}
