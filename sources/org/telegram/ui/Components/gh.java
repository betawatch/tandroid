package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi b;

    public /* synthetic */ gh(xi xiVar, int i10) {
        this.a = i10;
        this.b = xiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.a2();
                break;
            case 1:
                this.b.D0.invalidate();
                break;
            case 2:
                xi.q(this.b, valueAnimator);
                break;
            case 3:
                xi xiVar = this.b;
                xiVar.getClass();
                xiVar.J1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.a2();
                break;
        }
    }
}
