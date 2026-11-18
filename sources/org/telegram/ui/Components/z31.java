package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z31 extends g.p {
    public final /* synthetic */ h41 c;

    public z31(h41 h41Var) {
        this.c = h41Var;
    }

    @Override // g.p
    public final int i(int i7) {
        h41 h41Var = this.c;
        v4.i0 adapter = h41Var.n.getAdapter();
        g41 g41Var = h41Var.s;
        if (adapter == g41Var) {
            if ((g41Var.d.get(i7) instanceof Integer) || i7 >= g41Var.x) {
                return g41Var.w;
            }
            return 1;
        }
        jg.c2 c2Var = h41Var.w;
        SparseArray sparseArray = c2Var.s;
        if (i7 == c2Var.E || !(sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return c2Var.e.a();
        }
        return 1;
    }
}
