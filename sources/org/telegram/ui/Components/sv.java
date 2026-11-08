package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class sv extends g.p {
    public final /* synthetic */ hy c;

    public sv(hy hyVar) {
        this.c = hyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        hy hyVar = this.c;
        cy cyVar = hyVar.z0;
        v4.g0 adapter = hyVar.D0.getAdapter();
        yx yxVar = hyVar.y0;
        if (adapter != yxVar) {
            if (i7 == cyVar.y || !(cyVar.r.get(i7) == null || (cyVar.r.get(i7) instanceof TLRPC.Document))) {
                return yxVar.d;
            }
            return 1;
        }
        if (i7 == 0) {
            return yxVar.d;
        }
        if (i7 == yxVar.s || !(yxVar.h.get(i7) == null || (yxVar.h.get(i7) instanceof TLRPC.Document))) {
            return yxVar.d;
        }
        return 1;
    }
}
