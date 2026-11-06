package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ew implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ww d;

    public ew(ww wwVar, float f10, boolean z9, float f11) {
        this.d = wwVar;
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
        ww wwVar = this.d;
        wwVar.e0[0].a.scrollBy(0, i7);
        View view = wwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
