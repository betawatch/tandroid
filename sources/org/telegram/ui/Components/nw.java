package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nw extends f2.v {
    public final /* synthetic */ fz c;

    public nw(fz fzVar) {
        this.c = fzVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        fz fzVar = this.c;
        az azVar = fzVar.v0;
        f2.p0 adapter = fzVar.z0.getAdapter();
        wy wyVar = fzVar.u0;
        if (adapter != wyVar) {
            if (i10 == azVar.x || !(azVar.r.get(i10) == null || (azVar.r.get(i10) instanceof TLRPC.Document))) {
                return wyVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return wyVar.d;
        }
        if (i10 == wyVar.s || !(wyVar.h.get(i10) == null || (wyVar.h.get(i10) instanceof TLRPC.Document))) {
            return wyVar.d;
        }
        return 1;
    }
}
