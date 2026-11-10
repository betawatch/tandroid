package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;
    public final /* synthetic */ float c;

    public /* synthetic */ ju(zw zwVar, float f10, int i7) {
        this.a = i7;
        this.b = zwVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zw.a0(this.b, this.c, valueAnimator);
                break;
            default:
                zw.G0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
