package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v21 b;

    public /* synthetic */ t21(v21 v21Var, int i10) {
        this.a = i10;
        this.b = v21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v21 v21Var = this.b;
                v21Var.getClass();
                v21Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v21Var.h();
                v21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v21 v21Var2 = this.b;
                v21Var2.K = max;
                v21Var2.h.invalidate();
                break;
        }
    }
}
