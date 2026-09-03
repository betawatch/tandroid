package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ v2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                w2Var.getClass();
                w2Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.a(w2Var.O, w2Var.P);
                break;
            default:
                w2 w2Var2 = this.b;
                w2Var2.getClass();
                w2Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var2.invalidate();
                break;
        }
    }
}
