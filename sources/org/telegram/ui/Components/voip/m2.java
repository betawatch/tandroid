package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ m2(p2 p2Var, int i3) {
        this.a = i3;
        this.b = p2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.getClass();
                p2Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.invalidate();
                break;
            case 1:
                p2 p2Var2 = this.b;
                p2Var2.getClass();
                p2Var2.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p2Var2.invalidate();
                break;
            case 2:
                p2 p2Var3 = this.b;
                p2Var3.getClass();
                p2Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p2Var3.invalidate();
                break;
            default:
                p2 p2Var4 = this.b;
                p2Var4.getClass();
                p2Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p2Var4.invalidate();
                break;
        }
    }
}
