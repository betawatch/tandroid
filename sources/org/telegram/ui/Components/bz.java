package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;

    public /* synthetic */ bz(gz gzVar, int i7) {
        this.a = i7;
        this.b = gzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gz gzVar = this.b;
                gzVar.y = floatValue;
                gzVar.invalidate();
                break;
            default:
                gz gzVar2 = this.b;
                gzVar2.getClass();
                gzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gzVar2.invalidate();
                break;
        }
    }
}
