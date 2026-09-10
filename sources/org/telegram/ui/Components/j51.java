package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        fg.h2 h2Var = r51Var.v;
        SparseArray sparseArray = h2Var.s;
        if (i10 == h2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return h2Var.e.a();
        }
        return 1;
    }
}
