package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b30 b;

    public /* synthetic */ x20(b30 b30Var, int i10) {
        this.a = i10;
        this.b = b30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b30 b30Var = this.b;
                b30Var.r.x = (int) floatValue;
                b30Var.h();
                z20 z20Var = b30Var.a;
                if (z20Var.getParent() != null) {
                    b30Var.n.updateViewLayout(z20Var, b30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b30 b30Var2 = this.b;
                b30Var2.r.y = (int) floatValue2;
                z20 z20Var2 = b30Var2.a;
                if (z20Var2.getParent() != null) {
                    b30Var2.n.updateViewLayout(z20Var2, b30Var2.r);
                    break;
                }
                break;
        }
    }
}
