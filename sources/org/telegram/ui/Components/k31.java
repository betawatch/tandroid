package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k31 extends g.p {
    public final /* synthetic */ t31 c;

    public k31(t31 t31Var) {
        this.c = t31Var;
    }

    @Override // g.p
    public final int i(int i7) {
        t31 t31Var = this.c;
        v4.g0 adapter = t31Var.n.getAdapter();
        s31 s31Var = t31Var.s;
        if (adapter == s31Var) {
            if ((s31Var.d.get(i7) instanceof Integer) || i7 >= s31Var.x) {
                return s31Var.w;
            }
            return 1;
        }
        jg.d2 d2Var = t31Var.w;
        SparseArray sparseArray = d2Var.s;
        if (i7 == d2Var.D || !(sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return d2Var.e.a();
        }
        return 1;
    }
}
