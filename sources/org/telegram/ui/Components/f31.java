package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f31 extends g.p {
    public final /* synthetic */ n31 c;

    public f31(n31 n31Var) {
        this.c = n31Var;
    }

    @Override // g.p
    public final int i(int i3) {
        n31 n31Var = this.c;
        u4.h0 adapter = n31Var.n.getAdapter();
        m31 m31Var = n31Var.s;
        if (adapter == m31Var) {
            if ((m31Var.d.get(i3) instanceof Integer) || i3 >= m31Var.x) {
                return m31Var.w;
            }
            return 1;
        }
        kg.y1 y1Var = n31Var.w;
        SparseArray sparseArray = y1Var.s;
        if (i3 == y1Var.E || !(sparseArray.get(i3) == null || (sparseArray.get(i3) instanceof TLRPC.Document))) {
            return y1Var.e.a();
        }
        return 1;
    }
}
