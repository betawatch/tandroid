package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ey.W(this.b, this.c, valueAnimator);
                break;
            default:
                ey.D0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
