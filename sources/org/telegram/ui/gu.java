package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;
    public final /* synthetic */ float c;

    public /* synthetic */ gu(ww wwVar, float f10, int i7) {
        this.a = i7;
        this.b = wwVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ww.a0(this.b, this.c, valueAnimator);
                break;
            default:
                ww.G0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
