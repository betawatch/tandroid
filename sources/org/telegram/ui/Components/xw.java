package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class xw extends g.p {
    public final /* synthetic */ nz c;

    public xw(nz nzVar) {
        this.c = nzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        nz nzVar = this.c;
        iz izVar = nzVar.z0;
        s4.h0 adapter = nzVar.D0.getAdapter();
        ez ezVar = nzVar.y0;
        if (adapter != ezVar) {
            if (i10 == izVar.x || !(izVar.r.get(i10) == null || (izVar.r.get(i10) instanceof TLRPC.Document))) {
                return ezVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return ezVar.d;
        }
        if (i10 == ezVar.s || !(ezVar.h.get(i10) == null || (ezVar.h.get(i10) instanceof TLRPC.Document))) {
            return ezVar.d;
        }
        return 1;
    }
}
