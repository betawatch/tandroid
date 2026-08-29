package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.n40;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ w(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.getClass();
                l0Var.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.c = floatValue;
                r50 r50Var = l0Var2.f0;
                r50Var.v1.setAlpha(1.0f - floatValue);
                n40 n40Var = r50Var.K;
                n40Var.setAlpha((1.0f - r50Var.W1.c) * (n40Var.getTag() != null ? 1.0f : 0.0f));
                r50Var.E1(r50Var.u0);
                l0Var2.l();
                break;
        }
    }
}
