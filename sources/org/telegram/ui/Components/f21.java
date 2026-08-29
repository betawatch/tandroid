package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h21 b;

    public /* synthetic */ f21(h21 h21Var, int i10) {
        this.a = i10;
        this.b = h21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                lh.z2 z2Var = this.b.f;
                z2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                z2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                z2Var.invalidate();
                break;
            default:
                h21 h21Var = this.b;
                h21Var.getClass();
                h21Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h21Var.h();
                break;
        }
    }
}
