package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z31 extends f2.x {
    public final /* synthetic */ h41 c;

    public z31(h41 h41Var) {
        this.c = h41Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        h41 h41Var = this.c;
        f2.r0 adapter = h41Var.n.getAdapter();
        g41 g41Var = h41Var.s;
        if (adapter == g41Var) {
            if ((g41Var.d.get(i9) instanceof Integer) || i9 >= g41Var.w) {
                return g41Var.v;
            }
            return 1;
        }
        of.y1 y1Var = h41Var.v;
        SparseArray sparseArray = y1Var.s;
        if (i9 == y1Var.y || !(sparseArray.get(i9) == null || (sparseArray.get(i9) instanceof TLRPC.Document))) {
            return y1Var.e.a();
        }
        return 1;
    }
}
