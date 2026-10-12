package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ ew0 a;
    public final /* synthetic */ vp0 b;

    public hf(ew0 ew0Var, vp0 vp0Var) {
        this.a = ew0Var;
        this.b = vp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ew0 ew0Var = this.a;
        ew0Var.post(new n2.h(this, ew0Var, this.b, 16));
    }
}
