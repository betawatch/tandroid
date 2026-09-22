package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class m51 extends g.p {
    public final /* synthetic */ u51 c;

    public m51(u51 u51Var) {
        this.c = u51Var;
    }

    @Override // g.p
    public final int i(int i10) {
        u51 u51Var = this.c;
        s4.h0 adapter = u51Var.n.getAdapter();
        t51 t51Var = u51Var.s;
        if (adapter == t51Var) {
            if ((t51Var.d.get(i10) instanceof Integer) || i10 >= t51Var.w) {
                return t51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = u51Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
