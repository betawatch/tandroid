package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class cv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ dv e;

    public cv(dv dvVar, float f7, int i10, int i11, Activity activity) {
        this.e = dvVar;
        this.a = f7;
        this.b = i10;
        this.c = i11;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        fv fvVar = this.e.c;
        fvVar.n = i0.a.d(max, this.b, this.c);
        int i10 = fvVar.n;
        Activity activity = this.d;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(fvVar.n) >= 0.721f);
    }
}
