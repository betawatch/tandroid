package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ j2(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                t2Var.getClass();
                t2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                break;
            case 1:
                t2 t2Var2 = this.b;
                t2Var2.getClass();
                t2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var2.invalidate();
                break;
            default:
                t2 t2Var3 = this.b;
                t2Var3.getClass();
                t2Var3.y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var3.invalidate();
                break;
        }
    }
}
