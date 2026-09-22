package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ns0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt0 b;
    public final /* synthetic */ yu0 c;

    public /* synthetic */ ns0(yu0 yu0Var, rt0 rt0Var, int i10) {
        this.a = i10;
        this.c = yu0Var;
        this.b = rt0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.c.n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
            default:
                this.c.n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
        }
    }
}
