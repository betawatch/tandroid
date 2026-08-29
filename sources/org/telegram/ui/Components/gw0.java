package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jw0 b;

    public /* synthetic */ gw0(jw0 jw0Var, int i10) {
        this.a = i10;
        this.b = jw0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jw0 jw0Var = this.b;
                jw0Var.getClass();
                jw0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var.invalidate();
                break;
            case 1:
                jw0 jw0Var2 = this.b;
                jw0Var2.getClass();
                jw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                jw0 jw0Var3 = this.b;
                jw0Var3.getClass();
                jw0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var3.invalidate();
                break;
        }
    }
}
