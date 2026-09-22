package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg0 b;

    public /* synthetic */ eg0(gg0 gg0Var, int i10) {
        this.a = i10;
        this.b = gg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                gg0 gg0Var = this.b;
                gg0Var.getClass();
                gg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var.invalidate();
                break;
            default:
                gg0 gg0Var2 = this.b;
                gg0Var2.getClass();
                gg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var2.invalidate();
                break;
        }
    }
}
