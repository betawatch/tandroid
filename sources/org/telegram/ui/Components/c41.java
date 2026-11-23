package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c41 extends g.p {
    public final /* synthetic */ k41 c;

    public c41(k41 k41Var) {
        this.c = k41Var;
    }

    @Override // g.p
    public final int i(int i7) {
        k41 k41Var = this.c;
        v4.i0 adapter = k41Var.n.getAdapter();
        j41 j41Var = k41Var.s;
        if (adapter == j41Var) {
            if ((j41Var.d.get(i7) instanceof Integer) || i7 >= j41Var.x) {
                return j41Var.w;
            }
            return 1;
        }
        jg.c2 c2Var = k41Var.w;
        SparseArray sparseArray = c2Var.s;
        if (i7 == c2Var.E || !(sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return c2Var.e.a();
        }
        return 1;
    }
}
