package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class cw extends g.p {
    public final /* synthetic */ ry c;

    public cw(ry ryVar) {
        this.c = ryVar;
    }

    @Override // g.p
    public final int i(int i7) {
        ry ryVar = this.c;
        my myVar = ryVar.A0;
        v4.i0 adapter = ryVar.E0.getAdapter();
        jy jyVar = ryVar.z0;
        if (adapter != jyVar) {
            if (i7 == myVar.y || !(myVar.r.get(i7) == null || (myVar.r.get(i7) instanceof TLRPC.Document))) {
                return jyVar.d;
            }
            return 1;
        }
        if (i7 == 0) {
            return jyVar.d;
        }
        if (i7 == jyVar.s || !(jyVar.h.get(i7) == null || (jyVar.h.get(i7) instanceof TLRPC.Document))) {
            return jyVar.d;
        }
        return 1;
    }
}
