package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class cx extends g.o {
    public final /* synthetic */ tz c;

    public cx(tz tzVar) {
        this.c = tzVar;
    }

    @Override // g.o
    public final int i(int i10) {
        tz tzVar = this.c;
        oz ozVar = tzVar.z0;
        s4.g0 adapter = tzVar.D0.getAdapter();
        kz kzVar = tzVar.y0;
        if (adapter != kzVar) {
            if (i10 == ozVar.x || !(ozVar.r.get(i10) == null || (ozVar.r.get(i10) instanceof TLRPC.Document))) {
                return kzVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return kzVar.d;
        }
        if (i10 == kzVar.s || !(kzVar.h.get(i10) == null || (kzVar.h.get(i10) instanceof TLRPC.Document))) {
            return kzVar.d;
        }
        return 1;
    }
}
