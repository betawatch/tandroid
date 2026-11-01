package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ t0 b;

    public l0(t0 t0Var, float f7) {
        this.b = t0Var;
        this.a = f7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        t0 t0Var = this.b;
        t0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = t0Var.e.getX();
        float f7 = this.a;
        if (x10 != f7) {
            n0 n0Var = t0Var.e;
            n0Var.setTranslationX(f7 - n0Var.getX());
        }
        t0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(gr.f).start();
        return true;
    }
}
