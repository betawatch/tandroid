package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ u2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                w2Var.getClass();
                w2Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.requestLayout();
                q0.a aVar = w2Var.c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(w2Var.a));
                    break;
                }
                break;
            default:
                w2 w2Var2 = this.b;
                w2Var2.getClass();
                w2Var2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var2.requestLayout();
                q0.a aVar2 = w2Var2.c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(w2Var2.a));
                    break;
                }
                break;
        }
    }
}
