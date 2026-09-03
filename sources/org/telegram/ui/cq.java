package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq b;

    public /* synthetic */ cq(lq lqVar, int i10) {
        this.a = i10;
        this.b = lqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                lq lqVar = this.b;
                lqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lqVar.h.invalidateSelf();
                break;
            default:
                lq lqVar2 = this.b;
                lqVar2.getClass();
                lqVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = lqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
        }
    }
}
