package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class v51 extends g.p {
    public final /* synthetic */ d61 c;

    public v51(d61 d61Var) {
        this.c = d61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        d61 d61Var = this.c;
        s4.h0 adapter = d61Var.n.getAdapter();
        c61 c61Var = d61Var.s;
        if (adapter == c61Var) {
            if ((c61Var.d.get(i10) instanceof Integer) || i10 >= c61Var.w) {
                return c61Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = d61Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
