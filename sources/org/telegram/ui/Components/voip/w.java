package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.a50;
import org.telegram.ui.d60;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                l0Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.c = floatValue;
                d60 d60Var = l0Var2.g0;
                d60Var.w1.setAlpha(1.0f - floatValue);
                a50 a50Var = d60Var.L;
                a50Var.setAlpha((1.0f - d60Var.X1.c) * (a50Var.getTag() != null ? 1.0f : 0.0f));
                d60Var.E1(d60Var.v0);
                l0Var2.l();
                break;
        }
    }
}
