package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ sg0(ug0 ug0Var, int i10) {
        this.a = i10;
        this.b = ug0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = this.b;
                ug0Var.getClass();
                ug0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.invalidate();
                break;
            default:
                ug0 ug0Var2 = this.b;
                ug0Var2.getClass();
                ug0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.invalidate();
                break;
        }
    }
}
