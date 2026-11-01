package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ix implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ zx d;

    public ix(zx zxVar, float f7, boolean z10, float f10) {
        this.d = zxVar;
        this.b = f7;
        this.c = f10;
        this.a = (int) f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.i0.T1(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = T1 - this.a;
        this.a = T1;
        zx zxVar = this.d;
        zxVar.e0[0].a.scrollBy(0, i10);
        View view = zxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
