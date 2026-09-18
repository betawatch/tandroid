package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x41 extends g.p {
    public final /* synthetic */ f51 c;

    public x41(f51 f51Var) {
        this.c = f51Var;
    }

    @Override // g.p
    public final int i(int i10) {
        f51 f51Var = this.c;
        s4.h0 adapter = f51Var.n.getAdapter();
        e51 e51Var = f51Var.s;
        if (adapter == e51Var) {
            if ((e51Var.d.get(i10) instanceof Integer) || i10 >= e51Var.w) {
                return e51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = f51Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
