package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve0 b;

    public /* synthetic */ se0(ve0 ve0Var, int i7) {
        this.a = i7;
        this.b = ve0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ve0 ve0Var = this.b;
                ve0Var.getClass();
                ve0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var.c(true);
                break;
            default:
                ve0 ve0Var2 = this.b;
                ve0Var2.getClass();
                ve0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var2.c(true);
                break;
        }
    }
}
