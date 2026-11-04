package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qv extends g.p {
    public final /* synthetic */ ey c;

    public qv(ey eyVar) {
        this.c = eyVar;
    }

    @Override // g.p
    public final int i(int i3) {
        ey eyVar = this.c;
        yx yxVar = eyVar.A0;
        u4.h0 adapter = eyVar.E0.getAdapter();
        vx vxVar = eyVar.z0;
        if (adapter != vxVar) {
            if (i3 == yxVar.y || !(yxVar.r.get(i3) == null || (yxVar.r.get(i3) instanceof TLRPC.Document))) {
                return vxVar.d;
            }
            return 1;
        }
        if (i3 == 0) {
            return vxVar.d;
        }
        if (i3 == vxVar.s || !(vxVar.h.get(i3) == null || (vxVar.h.get(i3) instanceof TLRPC.Document))) {
            return vxVar.d;
        }
        return 1;
    }
}
