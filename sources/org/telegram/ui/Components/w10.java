package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a20 b;

    public /* synthetic */ w10(a20 a20Var, int i7) {
        this.a = i7;
        this.b = a20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a20 a20Var = this.b;
                a20Var.s.x = (int) floatValue;
                a20Var.i();
                y10 y10Var = a20Var.a;
                if (y10Var.getParent() != null) {
                    a20Var.n.updateViewLayout(y10Var, a20Var.s);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a20 a20Var2 = this.b;
                a20Var2.s.y = (int) floatValue2;
                y10 y10Var2 = a20Var2.a;
                if (y10Var2.getParent() != null) {
                    a20Var2.n.updateViewLayout(y10Var2, a20Var2.s);
                    break;
                }
                break;
        }
    }
}
