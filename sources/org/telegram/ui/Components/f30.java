package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j30 b;

    public /* synthetic */ f30(j30 j30Var, int i10) {
        this.a = i10;
        this.b = j30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j30 j30Var = this.b;
                j30Var.r.x = (int) floatValue;
                j30Var.h();
                h30 h30Var = j30Var.a;
                if (h30Var.getParent() != null) {
                    j30Var.n.updateViewLayout(h30Var, j30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j30 j30Var2 = this.b;
                j30Var2.r.y = (int) floatValue2;
                h30 h30Var2 = j30Var2.a;
                if (h30Var2.getParent() != null) {
                    j30Var2.n.updateViewLayout(h30Var2, j30Var2.r);
                    break;
                }
                break;
        }
    }
}
