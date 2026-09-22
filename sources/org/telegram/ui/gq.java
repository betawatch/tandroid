package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
