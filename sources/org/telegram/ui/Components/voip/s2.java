package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ s2(t2 t2Var, int i10) {
        this.a = i10;
        this.b = t2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                t2Var.getClass();
                t2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.a(t2Var.R, t2Var.S);
                break;
            default:
                t2 t2Var2 = this.b;
                t2Var2.getClass();
                t2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var2.invalidate();
                break;
        }
    }
}
