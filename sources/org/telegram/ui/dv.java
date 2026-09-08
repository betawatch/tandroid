package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ ev e;

    public dv(ev evVar, float f7, int i10, int i11, Activity activity) {
        this.e = evVar;
        this.a = f7;
        this.b = i10;
        this.c = i11;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        gv gvVar = this.e.c;
        gvVar.n = i0.a.d(max, this.b, this.c);
        int i10 = gvVar.n;
        Activity activity = this.d;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(gvVar.n) >= 0.721f);
    }
}
