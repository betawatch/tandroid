package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;
    public final /* synthetic */ float c;

    public /* synthetic */ nv(gy gyVar, float f10, int i10) {
        this.a = i10;
        this.b = gyVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                gy.V(this.b, this.c, valueAnimator);
                break;
            default:
                gy.E0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
