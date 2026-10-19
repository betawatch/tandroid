package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class u51 extends g.o {
    public final /* synthetic */ c61 c;

    public u51(c61 c61Var) {
        this.c = c61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        c61 c61Var = this.c;
        s4.g0 adapter = c61Var.n.getAdapter();
        b61 b61Var = c61Var.s;
        if (adapter == b61Var) {
            if ((b61Var.d.get(i10) instanceof Integer) || i10 >= b61Var.w) {
                return b61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = c61Var.v;
        SparseArray sparseArray = e2Var.s;
        if (i10 == e2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return e2Var.e.a();
        }
        return 1;
    }
}
