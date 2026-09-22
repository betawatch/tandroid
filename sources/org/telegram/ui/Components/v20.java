package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z20 b;

    public /* synthetic */ v20(z20 z20Var, int i10) {
        this.a = i10;
        this.b = z20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z20 z20Var = this.b;
                z20Var.r.x = (int) floatValue;
                z20Var.h();
                x20 x20Var = z20Var.a;
                if (x20Var.getParent() != null) {
                    z20Var.n.updateViewLayout(x20Var, z20Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z20 z20Var2 = this.b;
                z20Var2.r.y = (int) floatValue2;
                x20 x20Var2 = z20Var2.a;
                if (x20Var2.getParent() != null) {
                    z20Var2.n.updateViewLayout(x20Var2, z20Var2.r);
                    break;
                }
                break;
        }
    }
}
