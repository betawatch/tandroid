package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ v31(x31 x31Var, int i10) {
        this.a = i10;
        this.b = x31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ai.o4 o4Var = this.b.f;
                o4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.invalidate();
                break;
            default:
                x31 x31Var = this.b;
                x31Var.getClass();
                x31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x31Var.h();
                break;
        }
    }
}
