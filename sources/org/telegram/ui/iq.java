package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq b;

    public /* synthetic */ iq(rq rqVar, int i10) {
        this.a = i10;
        this.b = rqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rq rqVar = this.b;
                rqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                rqVar.h.invalidateSelf();
                break;
            default:
                rq rqVar2 = this.b;
                rqVar2.getClass();
                rqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = rqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
        }
    }
}
