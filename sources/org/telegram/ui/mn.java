package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.yc0 b;

    public /* synthetic */ mn(org.telegram.ui.Components.yc0 yc0Var, int i10) {
        this.a = i10;
        this.b = yc0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
