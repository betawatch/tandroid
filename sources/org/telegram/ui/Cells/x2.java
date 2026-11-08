package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ x2(z2 z2Var, int i7) {
        this.a = i7;
        this.b = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                z2Var.getClass();
                z2Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.requestLayout();
                q0.a aVar = z2Var.c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(z2Var.a));
                    break;
                }
                break;
            default:
                z2 z2Var2 = this.b;
                z2Var2.getClass();
                z2Var2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.requestLayout();
                q0.a aVar2 = z2Var2.c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(z2Var2.a));
                    break;
                }
                break;
        }
    }
}
