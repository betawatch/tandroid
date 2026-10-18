package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
