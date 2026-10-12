package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m30 b;

    public /* synthetic */ i30(m30 m30Var, int i10) {
        this.a = i10;
        this.b = m30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m30 m30Var = this.b;
                m30Var.r.x = (int) floatValue;
                m30Var.h();
                k30 k30Var = m30Var.a;
                if (k30Var.getParent() != null) {
                    m30Var.n.updateViewLayout(k30Var, m30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m30 m30Var2 = this.b;
                m30Var2.r.y = (int) floatValue2;
                k30 k30Var2 = m30Var2.a;
                if (k30Var2.getParent() != null) {
                    m30Var2.n.updateViewLayout(k30Var2, m30Var2.r);
                    break;
                }
                break;
        }
    }
}
