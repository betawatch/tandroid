package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements org.telegram.ui.Cells.a5, gg.b2 {
    public final /* synthetic */ pr a;

    public /* synthetic */ or(pr prVar) {
        this.a = prVar;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        pr prVar = this.a;
        TLObject E = prVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return prVar.y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // gg.b2
    public void h(int i10) {
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

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ void Q(ArrayList arrayList) {
    }
}
