package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e31 extends g.p {
    public final /* synthetic */ n31 c;

    public e31(n31 n31Var) {
        this.c = n31Var;
    }

    @Override // g.p
    public final int i(int i7) {
        n31 n31Var = this.c;
        v4.g0 adapter = n31Var.n.getAdapter();
        m31 m31Var = n31Var.s;
        if (adapter == m31Var) {
            if ((m31Var.d.get(i7) instanceof Integer) || i7 >= m31Var.x) {
                return m31Var.w;
            }
            return 1;
        }
        jg.d2 d2Var = n31Var.w;
        SparseArray sparseArray = d2Var.s;
        if (i7 == d2Var.D || !(sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return d2Var.e.a();
        }
        return 1;
    }
}
