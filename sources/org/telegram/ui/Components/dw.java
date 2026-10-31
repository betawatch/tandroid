package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dw extends g.o {
    public final /* synthetic */ vy c;

    public dw(vy vyVar) {
        this.c = vyVar;
    }

    @Override // g.o
    public final int i(int i10) {
        vy vyVar = this.c;
        qy qyVar = vyVar.z0;
        s4.g0 adapter = vyVar.D0.getAdapter();
        ny nyVar = vyVar.y0;
        if (adapter != nyVar) {
            if (i10 == qyVar.y || !(qyVar.r.get(i10) == null || (qyVar.r.get(i10) instanceof TLRPC.Document))) {
                return nyVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return nyVar.d;
        }
        if (i10 == nyVar.s || !(nyVar.h.get(i10) == null || (nyVar.h.get(i10) instanceof TLRPC.Document))) {
            return nyVar.d;
        }
        return 1;
    }
}
