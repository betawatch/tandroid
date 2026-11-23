package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cw extends g.p {
    public final /* synthetic */ qy c;

    public cw(qy qyVar) {
        this.c = qyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        qy qyVar = this.c;
        ly lyVar = qyVar.A0;
        v4.i0 adapter = qyVar.E0.getAdapter();
        iy iyVar = qyVar.z0;
        if (adapter != iyVar) {
            if (i7 == lyVar.y || !(lyVar.r.get(i7) == null || (lyVar.r.get(i7) instanceof TLRPC.Document))) {
                return iyVar.d;
            }
            return 1;
        }
        if (i7 == 0) {
            return iyVar.d;
        }
        if (i7 == iyVar.s || !(iyVar.h.get(i7) == null || (iyVar.h.get(i7) instanceof TLRPC.Document))) {
            return iyVar.d;
        }
        return 1;
    }
}
