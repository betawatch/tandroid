package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
