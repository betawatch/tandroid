package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class z51 extends g.o {
    public final /* synthetic */ h61 c;

    public z51(h61 h61Var) {
        this.c = h61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        h61 h61Var = this.c;
        s4.g0 adapter = h61Var.n.getAdapter();
        g61 g61Var = h61Var.s;
        if (adapter == g61Var) {
            if ((g61Var.d.get(i10) instanceof Integer) || i10 >= g61Var.w) {
                return g61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = h61Var.v;
        SparseArray sparseArray = e2Var.s;
        if (i10 == e2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return e2Var.e.a();
        }
        return 1;
    }
}
