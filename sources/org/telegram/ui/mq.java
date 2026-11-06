package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq implements org.telegram.ui.Cells.z4, jg.y1 {
    public final /* synthetic */ nq a;

    public /* synthetic */ mq(nq nqVar) {
        this.a = nqVar;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        nq nqVar = this.a;
        TLObject E = nqVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return nqVar.D.m0((TLRPC.ChannelParticipant) E, !z9, a5Var);
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // jg.y1
    public void q(int i7) {
        nq nqVar = this.a;
        oq oqVar = nqVar.D;
        if (nqVar.h.e()) {
            return;
        }
        int i10 = nqVar.r;
        nqVar.f();
        if (nqVar.r > i10) {
            oqVar.D0(i10);
        }
        if (nqVar.s || nqVar.r != 0 || i7 == 0) {
            return;
        }
        oqVar.b.e(false, true);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        return null;
    }

    @Override // jg.y1
    public /* synthetic */ void m1(ArrayList arrayList) {
    }
}
