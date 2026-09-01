package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements org.telegram.ui.Cells.a5, uf.j1 {
    public final /* synthetic */ pr a;

    public /* synthetic */ or(pr prVar) {
        this.a = prVar;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // uf.j1
    public /* synthetic */ boolean R(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        pr prVar = this.a;
        TLObject E = prVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return prVar.y.h0((TLRPC.ChannelParticipant) E, !z4, b5Var);
    }

    @Override // uf.j1
    public void g(int i10) {
        pr prVar = this.a;
        qr qrVar = prVar.y;
        if (prVar.h.e()) {
            return;
        }
        int i11 = prVar.r;
        prVar.l();
        if (prVar.r > i11) {
            qrVar.y0(i11);
        }
        if (prVar.s || prVar.r != 0 || i10 == 0) {
            return;
        }
        qrVar.b.e(false, true);
    }

    @Override // uf.j1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // uf.j1
    public /* synthetic */ void V(ArrayList arrayList) {
    }
}
