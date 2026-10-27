package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bx extends g.o {
    public final /* synthetic */ sz c;

    public bx(sz szVar) {
        this.c = szVar;
    }

    @Override // g.o
    public final int i(int i10) {
        sz szVar = this.c;
        nz nzVar = szVar.z0;
        s4.h0 adapter = szVar.D0.getAdapter();
        jz jzVar = szVar.y0;
        if (adapter != jzVar) {
            if (i10 == nzVar.x || !(nzVar.r.get(i10) == null || (nzVar.r.get(i10) instanceof TLRPC.Document))) {
                return jzVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return jzVar.d;
        }
        if (i10 == jzVar.s || !(jzVar.h.get(i10) == null || (jzVar.h.get(i10) instanceof TLRPC.Document))) {
            return jzVar.d;
        }
        return 1;
    }
}
