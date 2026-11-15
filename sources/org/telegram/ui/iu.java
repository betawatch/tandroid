package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;
    public final /* synthetic */ float c;

    public /* synthetic */ iu(yw ywVar, float f10, int i7) {
        this.a = i7;
        this.b = ywVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yw.a0(this.b, this.c, valueAnimator);
                break;
            default:
                yw.G0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
