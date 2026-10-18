package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        zv0Var.post(new ig.e2(this, zv0Var, this.b, 28));
    }
}
