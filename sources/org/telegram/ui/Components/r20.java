package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w20 b;

    public /* synthetic */ r20(w20 w20Var, int i10) {
        this.a = i10;
        this.b = w20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w20 w20Var = this.b;
                w20Var.r.x = (int) floatValue;
                w20Var.h();
                t20 t20Var = w20Var.a;
                if (t20Var.getParent() != null) {
                    w20Var.n.updateViewLayout(t20Var, w20Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w20 w20Var2 = this.b;
                w20Var2.r.y = (int) floatValue2;
                t20 t20Var2 = w20Var2.a;
                if (t20Var2.getParent() != null) {
                    w20Var2.n.updateViewLayout(t20Var2, w20Var2.r);
                    break;
                }
                break;
        }
    }
}
