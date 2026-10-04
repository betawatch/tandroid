package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class u51 extends g.p {
    public final /* synthetic */ c61 c;

    public u51(c61 c61Var) {
        this.c = c61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        c61 c61Var = this.c;
        s4.h0 adapter = c61Var.n.getAdapter();
        b61 b61Var = c61Var.s;
        if (adapter == b61Var) {
            if ((b61Var.d.get(i10) instanceof Integer) || i10 >= b61Var.w) {
                return b61Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = c61Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
