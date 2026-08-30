package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w41 extends f2.v {
    public final /* synthetic */ e51 c;

    public w41(e51 e51Var) {
        this.c = e51Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        e51 e51Var = this.c;
        f2.o0 adapter = e51Var.n.getAdapter();
        d51 d51Var = e51Var.s;
        if (adapter == d51Var) {
            if ((d51Var.d.get(i10) instanceof Integer) || i10 >= d51Var.w) {
                return d51Var.v;
            }
            return 1;
        }
        tf.m1 m1Var = e51Var.v;
        SparseArray sparseArray = m1Var.s;
        if (i10 == m1Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return m1Var.e.a();
        }
        return 1;
    }
}
