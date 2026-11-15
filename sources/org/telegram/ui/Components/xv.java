package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xv extends g.p {
    public final /* synthetic */ ly c;

    public xv(ly lyVar) {
        this.c = lyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        ly lyVar = this.c;
        gy gyVar = lyVar.A0;
        v4.h0 adapter = lyVar.E0.getAdapter();
        dy dyVar = lyVar.z0;
        if (adapter != dyVar) {
            if (i7 == gyVar.y || !(gyVar.r.get(i7) == null || (gyVar.r.get(i7) instanceof TLRPC.Document))) {
                return dyVar.d;
            }
            return 1;
        }
        if (i7 == 0) {
            return dyVar.d;
        }
        if (i7 == dyVar.s || !(dyVar.h.get(i7) == null || (dyVar.h.get(i7) instanceof TLRPC.Document))) {
            return dyVar.d;
        }
        return 1;
    }
}
