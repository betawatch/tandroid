package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class uw extends g.p {
    public final /* synthetic */ kz c;

    public uw(kz kzVar) {
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
