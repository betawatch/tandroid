package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class z20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d30 b;

    public /* synthetic */ z20(d30 d30Var, int i10) {
        this.a = i10;
        this.b = d30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d30 d30Var = this.b;
                d30Var.r.x = (int) floatValue;
                d30Var.h();
                b30 b30Var = d30Var.a;
                if (b30Var.getParent() != null) {
                    d30Var.n.updateViewLayout(b30Var, d30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d30 d30Var2 = this.b;
                d30Var2.r.y = (int) floatValue2;
                b30 b30Var2 = d30Var2.a;
                if (b30Var2.getParent() != null) {
                    d30Var2.n.updateViewLayout(b30Var2, d30Var2.r);
                    break;
                }
                break;
        }
    }
}
