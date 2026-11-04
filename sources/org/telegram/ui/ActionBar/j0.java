package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ q0 b;

    public j0(q0 q0Var, float f10) {
        this.b = q0Var;
        this.a = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        q0 q0Var = this.b;
        q0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = q0Var.e.getX();
        float f10 = this.a;
        if (x10 != f10) {
            bh.g gVar = q0Var.e;
            gVar.setTranslationX(f10 - gVar.getX());
        }
        q0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(xq.f).start();
        return true;
    }
}
