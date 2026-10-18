package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class t51 extends g.o {
    public final /* synthetic */ b61 c;

    public t51(b61 b61Var) {
        this.c = b61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        b61 b61Var = this.c;
        s4.g0 adapter = b61Var.n.getAdapter();
        a61 a61Var = b61Var.s;
        if (adapter == a61Var) {
            if ((a61Var.d.get(i10) instanceof Integer) || i10 >= a61Var.w) {
                return a61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = b61Var.v;
        SparseArray sparseArray = e2Var.s;
        if (i10 == e2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return e2Var.e.a();
        }
        return 1;
    }
}
