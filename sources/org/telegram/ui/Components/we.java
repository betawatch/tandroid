package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class we implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ fv0 a;
    public final /* synthetic */ yo0 b;

    public we(fv0 fv0Var, yo0 yo0Var) {
        this.a = fv0Var;
        this.b = yo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        fv0 fv0Var = this.a;
        fv0Var.post(new lh.p6(this, fv0Var, this.b, 25));
    }
}
