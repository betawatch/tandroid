package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r31 b;

    public /* synthetic */ o31(r31 r31Var, int i10) {
        this.a = i10;
        this.b = r31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ci.h3 h3Var = this.b.f;
                h3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.invalidate();
                break;
            default:
                r31 r31Var = this.b;
                r31Var.getClass();
                r31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r31Var.h();
                break;
        }
    }
}
