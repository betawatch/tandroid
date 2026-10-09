package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d61 extends g.o {
    public final /* synthetic */ l61 c;

    public d61(l61 l61Var) {
        this.c = l61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        l61 l61Var = this.c;
        s4.i0 adapter = l61Var.n.getAdapter();
        k61 k61Var = l61Var.s;
        if (adapter == k61Var) {
            if ((k61Var.d.get(i10) instanceof Integer) || i10 >= k61Var.w) {
                return k61Var.v;
            }
            return 1;
        }
        gg.f2 f2Var = l61Var.v;
        SparseArray sparseArray = f2Var.s;
        if (i10 == f2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return f2Var.e.a();
        }
        return 1;
    }
}
