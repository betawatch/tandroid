package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b41 extends g.p {
    public final /* synthetic */ j41 c;

    public b41(j41 j41Var) {
        this.c = j41Var;
    }

    @Override // g.p
    public final int i(int i7) {
        j41 j41Var = this.c;
        v4.i0 adapter = j41Var.n.getAdapter();
        i41 i41Var = j41Var.s;
        if (adapter == i41Var) {
            if ((i41Var.d.get(i7) instanceof Integer) || i7 >= i41Var.x) {
                return i41Var.w;
            }
            return 1;
        }
        jg.c2 c2Var = j41Var.w;
        SparseArray sparseArray = c2Var.s;
        if (i7 == c2Var.E || !(sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return c2Var.e.a();
        }
        return 1;
    }
}
