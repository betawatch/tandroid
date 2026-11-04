package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kq implements org.telegram.ui.Cells.z4, kg.u1 {
    public final /* synthetic */ mq a;

    public /* synthetic */ kq(mq mqVar) {
        this.a = mqVar;
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        return null;
    }

    @Override // kg.u1
    public /* synthetic */ boolean J1(int i3) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        mq mqVar = this.a;
        TLObject E = mqVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return mqVar.E.m0((TLRPC.ChannelParticipant) E, !z10, a5Var);
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        return null;
    }

    @Override // kg.u1
    public void r(int i3) {
        mq mqVar = this.a;
        nq nqVar = mqVar.E;
        if (mqVar.h.e()) {
            return;
        }
        int i10 = mqVar.r;
        mqVar.f();
        if (mqVar.r > i10) {
            nqVar.D0(i10);
        }
        if (mqVar.s || mqVar.r != 0 || i3 == 0) {
            return;
        }
        nqVar.b.e(false, true);
    }

    @Override // kg.u1
    public /* synthetic */ void b2(ArrayList arrayList) {
    }
}
