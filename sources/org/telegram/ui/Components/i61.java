package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i61 extends g.o {
    public final /* synthetic */ q61 c;

    public i61(q61 q61Var) {
        this.c = q61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        q61 q61Var = this.c;
        s4.h0 adapter = q61Var.n.getAdapter();
        p61 p61Var = q61Var.s;
        if (adapter == p61Var) {
            if ((p61Var.d.get(i10) instanceof Integer) || i10 >= p61Var.w) {
                return p61Var.v;
            }
            return 1;
        }
        ig.d2 d2Var = q61Var.v;
        SparseArray sparseArray = d2Var.s;
        if (i10 == d2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return d2Var.e.a();
        }
        return 1;
    }
}
