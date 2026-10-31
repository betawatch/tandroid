package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jx implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ay d;

    public jx(ay ayVar, float f7, boolean z10, float f10) {
        this.d = ayVar;
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
        ay ayVar = this.d;
        ayVar.e0[0].a.scrollBy(0, i10);
        View view = ayVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
