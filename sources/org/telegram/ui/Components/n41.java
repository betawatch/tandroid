package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n41 extends g.o {
    public final /* synthetic */ w41 c;

    public n41(w41 w41Var) {
        this.c = w41Var;
    }

    @Override // g.o
    public final int i(int i10) {
        w41 w41Var = this.c;
        s4.g0 adapter = w41Var.n.getAdapter();
        v41 v41Var = w41Var.s;
        if (adapter == v41Var) {
            if ((v41Var.d.get(i10) instanceof Integer) || i10 >= v41Var.x) {
                return v41Var.w;
            }
            return 1;
        }
        zf.o1 o1Var = w41Var.w;
        SparseArray sparseArray = o1Var.s;
        if (i10 == o1Var.D || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return o1Var.e.a();
        }
        return 1;
    }
}
