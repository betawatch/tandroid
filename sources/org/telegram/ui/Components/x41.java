package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x41 extends f2.v {
    public final /* synthetic */ f51 c;

    public x41(f51 f51Var) {
        this.c = f51Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        f51 f51Var = this.c;
        f2.p0 adapter = f51Var.n.getAdapter();
        e51 e51Var = f51Var.s;
        if (adapter == e51Var) {
            if ((e51Var.d.get(i10) instanceof Integer) || i10 >= e51Var.w) {
                return e51Var.v;
            }
            return 1;
        }
        uf.m1 m1Var = f51Var.v;
        SparseArray sparseArray = m1Var.s;
        if (i10 == m1Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return m1Var.e.a();
        }
        return 1;
    }
}
