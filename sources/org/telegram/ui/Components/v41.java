package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        gg.g2 g2Var = d51Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
