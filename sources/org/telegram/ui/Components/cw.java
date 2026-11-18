package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
