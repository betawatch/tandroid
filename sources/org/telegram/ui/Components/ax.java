package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ax extends g.p {
    public final /* synthetic */ rz c;

    public ax(rz rzVar) {
        this.c = rzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        rz rzVar = this.c;
        mz mzVar = rzVar.z0;
        s4.h0 adapter = rzVar.D0.getAdapter();
        iz izVar = rzVar.y0;
        if (adapter != izVar) {
            if (i10 == mzVar.x || !(mzVar.r.get(i10) == null || (mzVar.r.get(i10) instanceof TLRPC.Document))) {
                return izVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return izVar.d;
        }
        if (i10 == izVar.s || !(izVar.h.get(i10) == null || (izVar.h.get(i10) instanceof TLRPC.Document))) {
            return izVar.d;
        }
        return 1;
    }
}
