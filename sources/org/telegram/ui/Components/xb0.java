package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xb0 extends c91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ vc0 b;

    public xb0(vc0 vc0Var, Context context) {
        this.b = vc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        pc0 pc0Var = (pc0) view;
        pc0Var.h();
        pc0Var.k(false);
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        return new pc0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.c91
    public final int h(int i10) {
        return ((sc0) this.b.e.a.get(i10)).a;
    }
}
