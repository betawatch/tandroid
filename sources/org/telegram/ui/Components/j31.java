package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class j31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l31 b;

    public /* synthetic */ j31(l31 l31Var, int i10) {
        this.a = i10;
        this.b = l31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ci.i3 i3Var = this.b.f;
                i3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                i3Var.invalidate();
                break;
            default:
                l31 l31Var = this.b;
                l31Var.getClass();
                l31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l31Var.h();
                break;
        }
    }
}
