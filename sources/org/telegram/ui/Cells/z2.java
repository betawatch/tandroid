package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ z2(b3 b3Var, int i10) {
        this.a = i10;
        this.b = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b;
                b3Var.getClass();
                b3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.requestLayout();
                q0.a aVar = b3Var.c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(b3Var.a));
                    break;
                }
                break;
            default:
                b3 b3Var2 = this.b;
                b3Var2.getClass();
                b3Var2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var2.requestLayout();
                q0.a aVar2 = b3Var2.c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(b3Var2.a));
                    break;
                }
                break;
        }
    }
}
