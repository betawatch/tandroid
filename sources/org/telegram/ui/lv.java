package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;
    public final /* synthetic */ float c;

    public /* synthetic */ lv(ey eyVar, float f7, int i10) {
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
                ey.C0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
