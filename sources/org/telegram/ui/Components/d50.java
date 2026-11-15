package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d50 extends v4.t0 {
    public final /* synthetic */ v4.b0 a;
    public final /* synthetic */ p50 b;

    public d50(p50 p50Var, v4.b0 b0Var) {
        this.b = p50Var;
        this.a = b0Var;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        p50 p50Var = this.b;
        p50.I0(p50Var);
        if (!p50Var.M1 || p50Var.L1) {
            return;
        }
        if (p50Var.N1 - this.a.N0() < 10) {
            p50Var.K0();
        }
    }
}
