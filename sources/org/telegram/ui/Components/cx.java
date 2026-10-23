package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
