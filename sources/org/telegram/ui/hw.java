package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hw implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ zw d;

    public hw(zw zwVar, float f10, boolean z9, float f11) {
        this.d = zwVar;
        this.b = f10;
        this.c = f11;
        this.a = (int) f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.a;
        this.a = T1;
        zw zwVar = this.d;
        zwVar.e0[0].a.scrollBy(0, i7);
        View view = zwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
