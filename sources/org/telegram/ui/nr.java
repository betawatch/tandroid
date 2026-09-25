package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final /* synthetic */ or a;

    public /* synthetic */ nr(or orVar) {
        this.a = orVar;
    }

    @Override // gg.b2
    public void a(int i10) {
        or orVar = this.a;
        pr prVar = orVar.y;
        if (orVar.h.e()) {
            return;
        }
        int i11 = orVar.r;
        orVar.l();
        if (orVar.r > i11) {
            prVar.y0(i11);
        }
        if (orVar.s || orVar.r != 0 || i10 == 0) {
            return;
        }
        prVar.b.e(false, true);
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        or orVar = this.a;
        TLObject E = orVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return orVar.y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i i() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i o() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean s(int i10) {
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ void F(ArrayList arrayList) {
    }
}
