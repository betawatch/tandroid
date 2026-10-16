package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a61 extends g.o {
    public final /* synthetic */ i61 c;

    public a61(i61 i61Var) {
        this.c = i61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        i61 i61Var = this.c;
        s4.g0 adapter = i61Var.n.getAdapter();
        h61 h61Var = i61Var.s;
        if (adapter == h61Var) {
            if ((h61Var.d.get(i10) instanceof Integer) || i10 >= h61Var.w) {
                return h61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = i61Var.v;
        SparseArray sparseArray = e2Var.s;
        if (i10 == e2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return e2Var.e.a();
        }
        return 1;
    }
}
