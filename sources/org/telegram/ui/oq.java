package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final /* synthetic */ pq a;

    public /* synthetic */ oq(pq pqVar) {
        this.a = pqVar;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        pq pqVar = this.a;
        TLObject E = pqVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return pqVar.E.m0((TLRPC.ChannelParticipant) E, !z10, a5Var);
    }

    @Override // jg.y1
    public /* synthetic */ boolean e0(int i7) {
        return true;
    }

    @Override // jg.y1
    public void i(int i7) {
        pq pqVar = this.a;
        qq qqVar = pqVar.E;
        if (pqVar.h.e()) {
            return;
        }
        int i10 = pqVar.r;
        pqVar.f();
        if (pqVar.r > i10) {
            qqVar.D0(i10);
        }
        if (pqVar.s || pqVar.r != 0 || i7 == 0) {
            return;
        }
        qqVar.b.e(false, true);
    }

    @Override // jg.y1
    public /* synthetic */ void l0(ArrayList arrayList) {
    }
}
