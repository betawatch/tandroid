package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ b2(c2 c2Var, int i3) {
        this.a = i3;
        this.b = c2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.getClass();
                c2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.a(c2Var.S, c2Var.T);
                break;
            default:
                c2 c2Var2 = this.b;
                c2Var2.getClass();
                c2Var2.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var2.invalidate();
                break;
        }
    }
}
