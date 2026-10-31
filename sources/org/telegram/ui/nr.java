package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements org.telegram.ui.Cells.d5, zf.l1 {
    public final /* synthetic */ or a;

    public /* synthetic */ nr(or orVar) {
        this.a = orVar;
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        return null;
    }

    @Override // zf.l1
    public /* synthetic */ boolean Y(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.d5
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        int intValue = ((Integer) e5Var.getTag()).intValue();
        or orVar = this.a;
        TLObject E = orVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return orVar.D.l0((TLRPC.ChannelParticipant) E, !z10, e5Var);
    }

    @Override // zf.l1
    public void i(int i10) {
        or orVar = this.a;
        pr prVar = orVar.D;
        if (orVar.h.e()) {
            return;
        }
        int i11 = orVar.r;
        orVar.f();
        if (orVar.r > i11) {
            prVar.C0(i11);
        }
        if (orVar.s || orVar.r != 0 || i10 == 0) {
            return;
        }
        prVar.b.e(false, true);
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // zf.l1
    public /* synthetic */ void c0(ArrayList arrayList) {
    }
}
