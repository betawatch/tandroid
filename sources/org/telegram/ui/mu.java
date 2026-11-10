package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ mu(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                zw zwVar = this.b;
                zwVar.getClass();
                zwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                zw zwVar2 = this.b;
                zwVar2.getClass();
                zwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
