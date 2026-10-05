package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq b;

    public /* synthetic */ dq(mq mqVar, int i10) {
        this.a = i10;
        this.b = mqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                mq mqVar = this.b;
                mqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mqVar.h.invalidateSelf();
                break;
            default:
                mq mqVar2 = this.b;
                mqVar2.getClass();
                mqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = mqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
        }
    }
}
