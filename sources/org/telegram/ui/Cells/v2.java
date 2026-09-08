package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ v2(x2 x2Var, int i10) {
        this.a = i10;
        this.b = x2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                x2Var.getClass();
                x2Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.requestLayout();
                q0.a aVar = x2Var.c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(x2Var.a));
                    break;
                }
                break;
            default:
                x2 x2Var2 = this.b;
                x2Var2.getClass();
                x2Var2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.requestLayout();
                q0.a aVar2 = x2Var2.c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(x2Var2.a));
                    break;
                }
                break;
        }
    }
}
