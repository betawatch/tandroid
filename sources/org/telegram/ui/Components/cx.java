package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
