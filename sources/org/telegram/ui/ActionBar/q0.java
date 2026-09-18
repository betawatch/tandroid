package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ w0 b;

    public q0(w0 w0Var, float f7) {
        this.b = w0Var;
        this.a = f7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        w0 w0Var = this.b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.e.getX();
        float f7 = this.a;
        if (x10 != f7) {
            ci.h2 h2Var = w0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(qr.f).start();
        return true;
    }
}
