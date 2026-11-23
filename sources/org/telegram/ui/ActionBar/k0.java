package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ q0 b;

    public k0(q0 q0Var, float f10) {
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
            ah.i iVar = q0Var.e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        q0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(kr.f).start();
        return true;
    }
}
