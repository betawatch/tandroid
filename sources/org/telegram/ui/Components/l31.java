package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l31 extends g.p {
    public final /* synthetic */ u31 c;

    public l31(u31 u31Var) {
        this.c = u31Var;
    }

    @Override // g.p
    public final int i(int i7) {
        u31 u31Var = this.c;
        v4.g0 adapter = u31Var.n.getAdapter();
        t31 t31Var = u31Var.s;
        if (adapter == t31Var) {
            if ((t31Var.d.get(i7) instanceof Integer) || i7 >= t31Var.x) {
                return t31Var.w;
            }
            return 1;
        }
        jg.d2 d2Var = u31Var.w;
        SparseArray sparseArray = d2Var.s;
        if (i7 == d2Var.D || !(sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return d2Var.e.a();
        }
        return 1;
    }
}
