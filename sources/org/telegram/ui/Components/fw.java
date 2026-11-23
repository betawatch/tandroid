package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fw extends g.p {
    public final /* synthetic */ ty c;

    public fw(ty tyVar) {
        this.c = tyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        ty tyVar = this.c;
        oy oyVar = tyVar.A0;
        v4.i0 adapter = tyVar.E0.getAdapter();
        ly lyVar = tyVar.z0;
        if (adapter != lyVar) {
            if (i7 == oyVar.y || !(oyVar.r.get(i7) == null || (oyVar.r.get(i7) instanceof TLRPC.Document))) {
                return lyVar.d;
            }
            return 1;
        }
        if (i7 == 0) {
            return lyVar.d;
        }
        if (i7 == lyVar.s || !(lyVar.h.get(i7) == null || (lyVar.h.get(i7) instanceof TLRPC.Document))) {
            return lyVar.d;
        }
        return 1;
    }
}
