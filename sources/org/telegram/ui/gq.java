package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pq b;

    public /* synthetic */ gq(pq pqVar, int i10) {
        this.a = i10;
        this.b = pqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pq pqVar = this.b;
                pqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                pqVar.h.invalidateSelf();
                break;
            default:
                pq pqVar2 = this.b;
                pqVar2.getClass();
                pqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = pqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
        }
    }
}
