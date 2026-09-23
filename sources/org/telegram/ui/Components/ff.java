package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ fv0 a;
    public final /* synthetic */ uo0 b;

    public ff(fv0 fv0Var, uo0 uo0Var) {
        this.a = fv0Var;
        this.b = uo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        fv0 fv0Var = this.a;
        fv0Var.post(new org.telegram.ui.ActionBar.p(this, fv0Var, this.b, 8));
    }
}
