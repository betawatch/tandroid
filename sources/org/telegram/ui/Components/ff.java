package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ aw0 a;
    public final /* synthetic */ qp0 b;

    public ff(aw0 aw0Var, qp0 qp0Var) {
        this.a = aw0Var;
        this.b = qp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        aw0 aw0Var = this.a;
        aw0Var.post(new ig.e2(this, aw0Var, this.b, 28));
    }
}
