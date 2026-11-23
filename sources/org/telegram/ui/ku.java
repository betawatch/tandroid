package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;
    public final /* synthetic */ float c;

    public /* synthetic */ ku(cx cxVar, float f10, int i7) {
        this.a = i7;
        this.b = cxVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                cx.o0(this.b, this.c, valueAnimator);
                break;
            default:
                cx.H0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
