package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k30 b;

    public /* synthetic */ f30(k30 k30Var, int i10) {
        this.a = i10;
        this.b = k30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k30 k30Var = this.b;
                k30Var.r.x = (int) floatValue;
                k30Var.h();
                h30 h30Var = k30Var.a;
                if (h30Var.getParent() != null) {
                    k30Var.n.updateViewLayout(h30Var, k30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k30 k30Var2 = this.b;
                k30Var2.r.y = (int) floatValue2;
                h30 h30Var2 = k30Var2.a;
                if (h30Var2.getParent() != null) {
                    k30Var2.n.updateViewLayout(h30Var2, k30Var2.r);
                    break;
                }
                break;
        }
    }
}
