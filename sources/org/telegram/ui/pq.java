package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq implements org.telegram.ui.Cells.a5, jg.y1 {
    public final /* synthetic */ qq a;

    public /* synthetic */ pq(qq qqVar) {
        this.a = qqVar;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean b(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        qq qqVar = this.a;
        TLObject E = qqVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return qqVar.E.m0((TLRPC.ChannelParticipant) E, !z10, b5Var);
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
