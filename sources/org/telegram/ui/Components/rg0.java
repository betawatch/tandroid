package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg0 b;

    public /* synthetic */ rg0(tg0 tg0Var, int i10) {
        this.a = i10;
        this.b = tg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                tg0 tg0Var = this.b;
                tg0Var.getClass();
                tg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg0Var.invalidate();
                break;
            default:
                tg0 tg0Var2 = this.b;
                tg0Var2.getClass();
                tg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg0Var2.invalidate();
                break;
        }
    }
}
