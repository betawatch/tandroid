package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vn b;

    public /* synthetic */ vm(vn vnVar, int i10) {
        this.a = i10;
        this.b = vnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vn vnVar = this.b;
                vnVar.getClass();
                vnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                vn vnVar2 = this.b;
                vnVar2.getClass();
                vnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
