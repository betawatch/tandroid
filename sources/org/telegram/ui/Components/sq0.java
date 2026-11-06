package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class sq0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr0 b;
    public final /* synthetic */ xs0 c;

    public /* synthetic */ sq0(xs0 xs0Var, sr0 sr0Var, int i7) {
        this.a = i7;
        this.c = xs0Var;
        this.b = sr0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.c.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
            default:
                this.c.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
        }
    }
}
