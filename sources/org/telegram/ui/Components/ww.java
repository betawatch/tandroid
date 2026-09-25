package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ww extends g.p {
    public final /* synthetic */ lz c;

    public ww(lz lzVar) {
        this.c = lzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        lz lzVar = this.c;
        gz gzVar = lzVar.z0;
        s4.h0 adapter = lzVar.D0.getAdapter();
        cz czVar = lzVar.y0;
        if (adapter != czVar) {
            if (i10 == gzVar.x || !(gzVar.r.get(i10) == null || (gzVar.r.get(i10) instanceof TLRPC.Document))) {
                return czVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return czVar.d;
        }
        if (i10 == czVar.s || !(czVar.h.get(i10) == null || (czVar.h.get(i10) instanceof TLRPC.Document))) {
            return czVar.d;
        }
        return 1;
    }
}
