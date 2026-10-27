package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ w0 b;

    public p0(w0 w0Var, float f7) {
        this.b = w0Var;
        this.a = f7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        w0 w0Var = this.b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x9 = w0Var.e.getX();
        float f7 = this.a;
        if (x9 != f7) {
            fi.c2 c2Var = w0Var.e;
            c2Var.setTranslationX(f7 - c2Var.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(ds.f).start();
        return true;
    }
}
