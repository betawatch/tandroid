package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
