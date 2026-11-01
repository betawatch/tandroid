package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o41 extends g.o {
    public final /* synthetic */ x41 c;

    public o41(x41 x41Var) {
        this.c = x41Var;
    }

    @Override // g.o
    public final int i(int i10) {
        x41 x41Var = this.c;
        s4.g0 adapter = x41Var.n.getAdapter();
        w41 w41Var = x41Var.s;
        if (adapter == w41Var) {
            if ((w41Var.d.get(i10) instanceof Integer) || i10 >= w41Var.x) {
                return w41Var.w;
            }
            return 1;
        }
        zf.o1 o1Var = x41Var.w;
        SparseArray sparseArray = o1Var.s;
        if (i10 == o1Var.D || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return o1Var.e.a();
        }
        return 1;
    }
}
