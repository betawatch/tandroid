package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class j51 extends g.p {
    public final /* synthetic */ r51 c;

    public j51(r51 r51Var) {
        this.c = r51Var;
    }

    @Override // g.p
    public final int i(int i10) {
        r51 r51Var = this.c;
        s4.h0 adapter = r51Var.n.getAdapter();
        q51 q51Var = r51Var.s;
        if (adapter == q51Var) {
            if ((q51Var.d.get(i10) instanceof Integer) || i10 >= q51Var.w) {
                return q51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = r51Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
