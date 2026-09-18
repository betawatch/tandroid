package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class l51 extends g.p {
    public final /* synthetic */ t51 c;

    public l51(t51 t51Var) {
        this.c = t51Var;
    }

    @Override // g.p
    public final int i(int i10) {
        t51 t51Var = this.c;
        s4.h0 adapter = t51Var.n.getAdapter();
        s51 s51Var = t51Var.s;
        if (adapter == s51Var) {
            if ((s51Var.d.get(i10) instanceof Integer) || i10 >= s51Var.w) {
                return s51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = t51Var.v;
        SparseArray sparseArray = g2Var.s;
        if (i10 == g2Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return g2Var.e.a();
        }
        return 1;
    }
}
