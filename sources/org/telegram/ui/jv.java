package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;
    public final /* synthetic */ float c;

    public /* synthetic */ jv(ay ayVar, float f7, int i10) {
        this.a = i10;
        this.b = ayVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ay.Z(this.b, this.c, valueAnimator);
                break;
            default:
                ay.F0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
