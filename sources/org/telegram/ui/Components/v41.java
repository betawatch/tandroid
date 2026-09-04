package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
