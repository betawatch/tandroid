package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm b;

    public /* synthetic */ hm(mm mmVar, int i10) {
        this.a = i10;
        this.b = mmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                mm mmVar = this.b;
                mmVar.getClass();
                mmVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar.invalidate();
                break;
            default:
                mm mmVar2 = this.b;
                mmVar2.getClass();
                mmVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar2.invalidate();
                break;
        }
    }
}
