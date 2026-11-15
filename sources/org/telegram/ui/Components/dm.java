package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm b;

    public /* synthetic */ dm(hm hmVar, int i7) {
        this.a = i7;
        this.b = hmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                hm hmVar = this.b;
                hmVar.getClass();
                hmVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmVar.invalidate();
                break;
            default:
                hm hmVar2 = this.b;
                hmVar2.getClass();
                hmVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmVar2.invalidate();
                break;
        }
    }
}
