package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;
    public final /* synthetic */ float c;

    public /* synthetic */ eu(uw uwVar, float f10, int i3) {
        this.a = i3;
        this.b = uwVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uw.a0(this.b, this.c, valueAnimator);
                break;
            default:
                uw.G0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
