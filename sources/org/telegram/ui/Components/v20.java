package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
