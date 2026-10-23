package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class v51 extends g.o {
    public final /* synthetic */ d61 c;

    public v51(d61 d61Var) {
        this.c = d61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        d61 d61Var = this.c;
        s4.g0 adapter = d61Var.n.getAdapter();
        c61 c61Var = d61Var.s;
        if (adapter == c61Var) {
            if ((c61Var.d.get(i10) instanceof Integer) || i10 >= c61Var.w) {
                return c61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = d61Var.v;
        SparseArray sparseArray = e2Var.s;
        if (i10 == e2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return e2Var.e.a();
        }
        return 1;
    }
}
