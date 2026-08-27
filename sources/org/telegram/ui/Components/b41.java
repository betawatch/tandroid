package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b41 extends f2.w {
    public final /* synthetic */ j41 c;

    public b41(j41 j41Var) {
        this.c = j41Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        j41 j41Var = this.c;
        f2.q0 adapter = j41Var.n.getAdapter();
        i41 i41Var = j41Var.s;
        if (adapter == i41Var) {
            if ((i41Var.d.get(i10) instanceof Integer) || i10 >= i41Var.w) {
                return i41Var.v;
            }
            return 1;
        }
        pf.l1 l1Var = j41Var.v;
        SparseArray sparseArray = l1Var.s;
        if (i10 == l1Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return l1Var.e.a();
        }
        return 1;
    }
}
