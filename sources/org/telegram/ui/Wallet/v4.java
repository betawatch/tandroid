package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ v4(o6 o6Var, int i7) {
        this.a = i7;
        this.b = o6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o6 o6Var = this.b;
                o6Var.getClass();
                o6Var.R0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                o6 o6Var2 = this.b;
                o6Var2.getClass();
                o6Var2.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var2.Y0();
                break;
        }
    }
}
