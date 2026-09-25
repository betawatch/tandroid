package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class o0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ u0 b;

    public o0(u0 u0Var, float f7) {
        this.b = u0Var;
        this.a = f7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        u0 u0Var = this.b;
        u0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = u0Var.e.getX();
        float f7 = this.a;
        if (x10 != f7) {
            ci.h2 h2Var = u0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        u0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(rr.f).start();
        return true;
    }
}
