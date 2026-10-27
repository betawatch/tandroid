package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ nw0 a;
    public final /* synthetic */ bq0 b;

    public ff(nw0 nw0Var, bq0 bq0Var) {
        this.a = nw0Var;
        this.b = bq0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        nw0 nw0Var = this.a;
        nw0Var.post(new jg.f1(this, nw0Var, this.b, 29));
    }
}
