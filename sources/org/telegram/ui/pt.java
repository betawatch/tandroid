package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ org.telegram.ui.Components.vd e;

    public pt(org.telegram.ui.Components.vd vdVar, float f10, int i3, int i10, Activity activity) {
        this.e = vdVar;
        this.a = f10;
        this.b = i3;
        this.c = i10;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        rt rtVar = (rt) this.e.d;
        rtVar.n = i0.a.f(max, this.b, this.c);
        int i3 = rtVar.n;
        Activity activity = this.d;
        org.telegram.messenger.g0.t3(activity, i3, false);
        org.telegram.messenger.g0.m3(activity, org.telegram.messenger.g0.B(rtVar.n) >= 0.721f);
    }
}
