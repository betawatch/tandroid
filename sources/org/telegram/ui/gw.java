package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gw implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ yw d;

    public gw(yw ywVar, float f10, boolean z10, float f11) {
        this.d = ywVar;
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
        yw ywVar = this.d;
        ywVar.f0[0].a.scrollBy(0, i7);
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
