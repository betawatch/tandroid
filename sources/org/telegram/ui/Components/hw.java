package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hw extends f2.x {
    public final /* synthetic */ wy c;

    public hw(wy wyVar) {
        this.c = wyVar;
    }

    @Override // f2.x
    public final int i(int i9) {
        wy wyVar = this.c;
        ry ryVar = wyVar.v0;
        f2.r0 adapter = wyVar.z0.getAdapter();
        ny nyVar = wyVar.u0;
        if (adapter != nyVar) {
            if (i9 == ryVar.x || !(ryVar.r.get(i9) == null || (ryVar.r.get(i9) instanceof TLRPC.Document))) {
                return nyVar.d;
            }
            return 1;
        }
        if (i9 == 0) {
            return nyVar.d;
        }
        if (i9 == nyVar.s || !(nyVar.h.get(i9) == null || (nyVar.h.get(i9) instanceof TLRPC.Document))) {
            return nyVar.d;
        }
        return 1;
    }
}
