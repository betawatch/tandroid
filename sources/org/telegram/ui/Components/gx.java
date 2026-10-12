package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gx extends g.o {
    public final /* synthetic */ wz c;

    public gx(wz wzVar) {
        this.c = wzVar;
    }

    @Override // g.o
    public final int i(int i10) {
        wz wzVar = this.c;
        rz rzVar = wzVar.z0;
        s4.g0 adapter = wzVar.D0.getAdapter();
        mz mzVar = wzVar.y0;
        if (adapter != mzVar) {
            if (i10 == rzVar.x || !(rzVar.r.get(i10) == null || (rzVar.r.get(i10) instanceof TLRPC.Document))) {
                return mzVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return mzVar.d;
        }
        if (i10 == mzVar.s || !(mzVar.h.get(i10) == null || (mzVar.h.get(i10) instanceof TLRPC.Document))) {
            return mzVar.d;
        }
        return 1;
    }
}
