package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                kqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = kqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
        }
    }
}
