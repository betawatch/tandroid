package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p31 extends g.p {
    public final /* synthetic */ x31 c;

    public p31(x31 x31Var) {
        this.c = x31Var;
    }

    @Override // g.p
    public final int i(int i7) {
        x31 x31Var = this.c;
        v4.h0 adapter = x31Var.n.getAdapter();
        w31 w31Var = x31Var.s;
        if (adapter == w31Var) {
            if ((w31Var.d.get(i7) instanceof Integer) || i7 >= w31Var.x) {
                return w31Var.w;
            }
            return 1;
        }
        jg.c2 c2Var = x31Var.w;
        SparseArray sparseArray = c2Var.s;
        if (i7 == c2Var.E || !(sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return c2Var.e.a();
        }
        return 1;
    }
}
