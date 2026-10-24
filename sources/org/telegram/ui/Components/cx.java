package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
