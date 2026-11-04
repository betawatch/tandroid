package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w40 extends u4.t0 {
    public final /* synthetic */ u4.b0 a;
    public final /* synthetic */ i50 b;

    public w40(i50 i50Var, u4.b0 b0Var) {
        this.b = i50Var;
        this.a = b0Var;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        i50 i50Var = this.b;
        i50.I0(i50Var);
        if (!i50Var.J1 || i50Var.I1) {
            return;
        }
        if (i50Var.K1 - this.a.N0() < 10) {
            i50Var.K0();
        }
    }
}
