package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final /* synthetic */ pq a;

    public /* synthetic */ oq(pq pqVar) {
        this.a = pqVar;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        pq pqVar = this.a;
        TLObject E = pqVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return pqVar.D.m0((TLRPC.ChannelParticipant) E, !z9, a5Var);
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // jg.y1
    public void q(int i7) {
        pq pqVar = this.a;
        qq qqVar = pqVar.D;
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
    public /* synthetic */ a0.h v0() {
        return null;
    }

    @Override // jg.y1
    public /* synthetic */ void m1(ArrayList arrayList) {
    }
}
