package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class jw implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ cx d;

    public jw(cx cxVar, float f10, boolean z10, float f11) {
        this.d = cxVar;
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
        cx cxVar = this.d;
        cxVar.f0[0].a.scrollBy(0, i7);
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
