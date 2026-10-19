package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ec0 extends s4.r0 {
    public final /* synthetic */ nc0 a;

    public ec0(nc0 nc0Var) {
        this.a = nc0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        nc0 nc0Var = this.a;
        nc0Var.Q = z10;
        if (z10 || nc0Var.L == null) {
            return;
        }
        nc0Var.L = null;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        nc0 nc0Var = this.a;
        nc0Var.z0(false);
        if (nc0Var.L != null) {
            nc0Var.N += i11;
        }
    }
}
