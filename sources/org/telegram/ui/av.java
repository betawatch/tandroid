package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class av implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ bv e;

    public av(bv bvVar, float f10, int i10, int i11, Activity activity) {
        this.e = bvVar;
        this.a = f10;
        this.b = i10;
        this.c = i11;
        this.d = activity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float max = Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 350.0f) - this.a) / 150.0f));
        cv cvVar = this.e.c;
        cvVar.n = i0.a.d(max, this.b, this.c);
        int i10 = cvVar.n;
        Activity activity = this.d;
        AndroidUtilities.setNavigationBarColor(activity, i10, false);
        AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(cvVar.n) >= 0.721f);
    }
}
