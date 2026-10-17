package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ zv0 a;
    public final /* synthetic */ qp0 b;

    public ff(zv0 zv0Var, qp0 qp0Var) {
        this.a = zv0Var;
        this.b = qp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        zv0 zv0Var = this.a;
        zv0Var.post(new ig.c2(this, zv0Var, this.b, 28));
    }
}
