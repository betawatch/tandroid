package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kx extends g.o {
    public final /* synthetic */ a00 c;

    public kx(a00 a00Var) {
        this.c = a00Var;
    }

    @Override // g.o
    public final int i(int i10) {
        a00 a00Var = this.c;
        vz vzVar = a00Var.z0;
        s4.i0 adapter = a00Var.D0.getAdapter();
        qz qzVar = a00Var.y0;
        if (adapter != qzVar) {
            if (i10 == vzVar.x || !(vzVar.r.get(i10) == null || (vzVar.r.get(i10) instanceof TLRPC.Document))) {
                return qzVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return qzVar.d;
        }
        if (i10 == qzVar.s || !(qzVar.h.get(i10) == null || (qzVar.h.get(i10) instanceof TLRPC.Document))) {
            return qzVar.d;
        }
        return 1;
    }
}
