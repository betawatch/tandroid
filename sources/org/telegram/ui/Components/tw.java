package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tw extends f2.v {
    public final /* synthetic */ mz c;

    public tw(mz mzVar) {
        this.c = mzVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        mz mzVar = this.c;
        hz hzVar = mzVar.w0;
        f2.p0 adapter = mzVar.A0.getAdapter();
        dz dzVar = mzVar.v0;
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
