package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l50 extends v4.u0 {
    public final /* synthetic */ v4.c0 a;
    public final /* synthetic */ x50 b;

    public l50(x50 x50Var, v4.c0 c0Var) {
        this.b = x50Var;
        this.a = c0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        x50 x50Var = this.b;
        x50.J0(x50Var);
        if (!x50Var.M1 || x50Var.L1) {
            return;
        }
        if (x50Var.N1 - this.a.N0() < 10) {
            x50Var.L0();
        }
    }
}
