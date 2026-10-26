package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
