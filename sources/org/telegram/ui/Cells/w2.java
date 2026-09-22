package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ w2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                y2Var.getClass();
                y2Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.requestLayout();
                q0.a aVar = y2Var.c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(y2Var.a));
                    break;
                }
                break;
            default:
                y2 y2Var2 = this.b;
                y2Var2.getClass();
                y2Var2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.requestLayout();
                q0.a aVar2 = y2Var2.c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(y2Var2.a));
                    break;
                }
                break;
        }
    }
}
