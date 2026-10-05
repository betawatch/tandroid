package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final /* synthetic */ qr a;

    public /* synthetic */ pr(qr qrVar) {
        this.a = qrVar;
    }

    @Override // gg.b2
    public void a(int i10) {
        qr qrVar = this.a;
        rr rrVar = qrVar.y;
        if (qrVar.h.e()) {
            return;
        }
        int i11 = qrVar.r;
        qrVar.l();
        if (qrVar.r > i11) {
            rrVar.y0(i11);
        }
        if (qrVar.s || qrVar.r != 0 || i10 == 0) {
            return;
        }
        rrVar.b.e(false, true);
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        qr qrVar = this.a;
        TLObject E = qrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return qrVar.y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i s() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i x() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean z(int i10) {
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ void F(ArrayList arrayList) {
    }
}
