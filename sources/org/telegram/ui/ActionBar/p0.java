package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ v0 b;

    public p0(v0 v0Var, float f7) {
        this.b = v0Var;
        this.a = f7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        v0 v0Var = this.b;
        v0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.e.getX();
        float f7 = this.a;
        if (x10 != f7) {
            di.h2 h2Var = v0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        v0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(pr.f).start();
        return true;
    }
}
