package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ vd0(xd0 xd0Var, int i3) {
        this.a = i3;
        this.b = xd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xd0 xd0Var = this.b;
                xd0Var.getClass();
                xd0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.invalidate();
                break;
            default:
                xd0 xd0Var2 = this.b;
                xd0Var2.getClass();
                xd0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var2.invalidate();
                break;
        }
    }
}
