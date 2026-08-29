package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;
    public final /* synthetic */ float c;

    public /* synthetic */ lv(fy fyVar, float f9, int i10) {
        this.a = i10;
        this.b = fyVar;
        this.c = f9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fy.V(this.b, this.c, valueAnimator);
                break;
            default:
                fy.E0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
