package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u00 b;

    public /* synthetic */ t00(u00 u00Var, int i10) {
        this.a = i10;
        this.b = u00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u00 u00Var = this.b;
                u00Var.getClass();
                u00Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                break;
            case 1:
                u00 u00Var2 = this.b;
                u00Var2.getClass();
                u00Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                u00Var2.invalidate();
                break;
            default:
                u00 u00Var3 = this.b;
                u00Var3.getClass();
                u00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var3.invalidate();
                break;
        }
    }
}
