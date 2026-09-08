package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vw extends g.p {
    public final /* synthetic */ kz c;

    public vw(kz kzVar) {
        this.c = kzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        kz kzVar = this.c;
        fz fzVar = kzVar.z0;
        s4.h0 adapter = kzVar.D0.getAdapter();
        bz bzVar = kzVar.y0;
        if (adapter != bzVar) {
            if (i10 == fzVar.x || !(fzVar.r.get(i10) == null || (fzVar.r.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return bzVar.d;
        }
        if (i10 == bzVar.s || !(bzVar.h.get(i10) == null || (bzVar.h.get(i10) instanceof TLRPC.Document))) {
            return bzVar.d;
        }
        return 1;
    }
}
