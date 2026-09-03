package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v41 extends f2.v {
    public final /* synthetic */ d51 c;

    public v41(d51 d51Var) {
        this.c = d51Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        d51 d51Var = this.c;
        f2.p0 adapter = d51Var.n.getAdapter();
        c51 c51Var = d51Var.s;
        if (adapter == c51Var) {
            if ((c51Var.d.get(i10) instanceof Integer) || i10 >= c51Var.w) {
                return c51Var.v;
            }
            return 1;
        }
        uf.m1 m1Var = d51Var.v;
        SparseArray sparseArray = m1Var.s;
        if (i10 == m1Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return m1Var.e.a();
        }
        return 1;
    }
}
