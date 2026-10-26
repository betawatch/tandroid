package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h61 extends g.o {
    public final /* synthetic */ p61 c;

    public h61(p61 p61Var) {
        this.c = p61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        p61 p61Var = this.c;
        s4.h0 adapter = p61Var.n.getAdapter();
        o61 o61Var = p61Var.s;
        if (adapter == o61Var) {
            if ((o61Var.d.get(i10) instanceof Integer) || i10 >= o61Var.w) {
                return o61Var.v;
            }
            return 1;
        }
        ig.d2 d2Var = p61Var.v;
        SparseArray sparseArray = d2Var.s;
        if (i10 == d2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return d2Var.e.a();
        }
        return 1;
    }
}
