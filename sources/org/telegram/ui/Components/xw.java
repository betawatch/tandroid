package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class xw extends g.p {
    public final /* synthetic */ mz c;

    public xw(mz mzVar) {
        this.c = mzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        mz mzVar = this.c;
        hz hzVar = mzVar.z0;
        s4.h0 adapter = mzVar.D0.getAdapter();
        dz dzVar = mzVar.y0;
        if (adapter != dzVar) {
            if (i10 == hzVar.x || !(hzVar.r.get(i10) == null || (hzVar.r.get(i10) instanceof TLRPC.Document))) {
                return dzVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return dzVar.d;
        }
        if (i10 == dzVar.s || !(dzVar.h.get(i10) == null || (dzVar.h.get(i10) instanceof TLRPC.Document))) {
            return dzVar.d;
        }
        return 1;
    }
}
