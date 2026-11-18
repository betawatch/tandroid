package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final /* synthetic */ qq a;

    public /* synthetic */ pq(qq qqVar) {
        this.a = qqVar;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qq qqVar = this.a;
        TLObject E = qqVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return qqVar.E.m0((TLRPC.ChannelParticipant) E, !z10, a5Var);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // jg.y1
    public void r(int i7) {
        qq qqVar = this.a;
        rq rqVar = qqVar.E;
        if (qqVar.h.e()) {
            return;
        }
        int i10 = qqVar.r;
        qqVar.f();
        if (qqVar.r > i10) {
            rqVar.D0(i10);
        }
        if (qqVar.s || qqVar.r != 0 || i7 == 0) {
            return;
        }
        rqVar.b.e(false, true);
    }

    @Override // jg.y1
    public /* synthetic */ boolean v1(int i7) {
        return true;
    }

    @Override // jg.y1
    public /* synthetic */ void P1(ArrayList arrayList) {
    }
}
