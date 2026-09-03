package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq b;

    public /* synthetic */ bq(kq kqVar, int i10) {
        this.a = i10;
        this.b = kqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                kq kqVar = this.b;
                kqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kqVar.h.invalidateSelf();
                break;
            default:
                kq kqVar2 = this.b;
                kqVar2.getClass();
                kqVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = kqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
        }
    }
}
