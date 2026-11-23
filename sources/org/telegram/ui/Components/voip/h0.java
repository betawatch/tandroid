package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c30;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ h0(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.getClass();
                l0Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.c = floatValue;
                e40 e40Var = l0Var2.k0;
                e40Var.y3.setAlpha(1.0f - floatValue);
                c30 c30Var = e40Var.J1;
                c30Var.setAlpha((1.0f - e40Var.Z3.c) * (c30Var.getTag() != null ? 1.0f : 0.0f));
                e40Var.K1(e40Var.t2);
                l0Var2.l();
                break;
        }
    }
}
