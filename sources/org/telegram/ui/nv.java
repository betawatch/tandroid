package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ nv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                qyVar.getClass();
                qyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                qy qyVar2 = this.b;
                qyVar2.getClass();
                qyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
