package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;
    public final /* synthetic */ float c;

    public /* synthetic */ kv(ey eyVar, float f7, int i10) {
        this.a = i10;
        this.b = eyVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ey.V(this.b, this.c, valueAnimator);
                break;
            default:
                ey.B0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
