package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class v41 extends g.p {
    public final /* synthetic */ d51 c;

    public v41(d51 d51Var) {
        this.c = d51Var;
    }

    @Override // g.p
    public final int i(int i10) {
        d51 d51Var = this.c;
        s4.h0 adapter = d51Var.n.getAdapter();
        c51 c51Var = d51Var.s;
        if (adapter == c51Var) {
            if ((c51Var.d.get(i10) instanceof Integer) || i10 >= c51Var.w) {
                return c51Var.v;
            }
            return 1;
        }
        hg.f2 f2Var = d51Var.v;
        SparseArray sparseArray = f2Var.s;
        if (i10 == f2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return f2Var.e.a();
        }
        return 1;
    }
}
