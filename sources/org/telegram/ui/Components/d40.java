package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j40 b;

    public /* synthetic */ d40(j40 j40Var, int i3) {
        this.a = i3;
        this.b = j40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j40 j40Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * j40Var.getMeasuredHeight() * 0.5f;
                j40Var.x0 = floatValue;
                j40Var.s.setTranslationY(floatValue + j40Var.w0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j40 j40Var2 = this.b;
                j40Var2.z0 = floatValue2;
                wi.t0 t0Var = j40Var2.P;
                if (t0Var != null) {
                    t0Var.x(floatValue2);
                    break;
                }
                break;
        }
    }
}
