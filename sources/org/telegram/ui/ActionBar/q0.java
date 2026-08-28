package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ w0 b;

    public q0(w0 w0Var, float f10) {
        this.b = w0Var;
        this.a = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        w0 w0Var = this.b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.e.getX();
        float f10 = this.a;
        if (x10 != f10) {
            fg.g gVar = w0Var.e;
            gVar.setTranslationX(f10 - gVar.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(gr.f).start();
        return true;
    }
}
