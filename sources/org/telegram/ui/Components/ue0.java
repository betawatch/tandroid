package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe0 b;

    public /* synthetic */ ue0(xe0 xe0Var, int i3) {
        this.a = i3;
        this.b = xe0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xe0 xe0Var = this.b;
                xe0Var.getClass();
                xe0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe0Var.c(true);
                break;
            default:
                xe0 xe0Var2 = this.b;
                xe0Var2.getClass();
                xe0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe0Var2.c(true);
                break;
        }
    }
}
