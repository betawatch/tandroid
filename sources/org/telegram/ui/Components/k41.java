package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k41 extends f2.v {
    public final /* synthetic */ s41 c;

    public k41(s41 s41Var) {
        this.c = s41Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        s41 s41Var = this.c;
        f2.p0 adapter = s41Var.n.getAdapter();
        r41 r41Var = s41Var.s;
        if (adapter == r41Var) {
            if ((r41Var.d.get(i10) instanceof Integer) || i10 >= r41Var.w) {
                return r41Var.v;
            }
            return 1;
        }
        rf.m1 m1Var = s41Var.v;
        SparseArray sparseArray = m1Var.s;
        if (i10 == m1Var.y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return m1Var.e.a();
        }
        return 1;
    }
}
