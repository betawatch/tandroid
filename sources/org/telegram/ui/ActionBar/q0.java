package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            lg.f fVar = w0Var.e;
            fVar.setTranslationX(f10 - fVar.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(pr.f).start();
        return true;
    }
}
