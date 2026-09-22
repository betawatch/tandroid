package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w41 extends g.p {
    public final /* synthetic */ e51 c;

    public w41(e51 e51Var) {
        this.c = e51Var;
    }

    @Override // g.p
    public final int i(int i10) {
        e51 e51Var = this.c;
        s4.h0 adapter = e51Var.n.getAdapter();
        d51 d51Var = e51Var.s;
        if (adapter == d51Var) {
            if ((d51Var.d.get(i10) instanceof Integer) || i10 >= d51Var.w) {
                return d51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = e51Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
