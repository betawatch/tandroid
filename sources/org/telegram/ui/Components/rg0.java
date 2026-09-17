package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ rg0(ug0 ug0Var, int i10) {
        this.a = i10;
        this.b = ug0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = this.b;
                ug0Var.getClass();
                ug0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.c(true);
                break;
            default:
                ug0 ug0Var2 = this.b;
                ug0Var2.getClass();
                ug0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.c(true);
                break;
        }
    }
}
