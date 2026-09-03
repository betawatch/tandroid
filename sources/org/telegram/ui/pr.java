package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements org.telegram.ui.Cells.z4, tf.i1 {
    public final /* synthetic */ qr a;

    public /* synthetic */ pr(qr qrVar) {
        this.a = qrVar;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h H0() {
        return null;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z4) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qr qrVar = this.a;
        TLObject E = qrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return qrVar.y.h0((TLRPC.ChannelParticipant) E, !z4, a5Var);
    }

    @Override // tf.i1
    public void k(int i10) {
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

    @Override // tf.i1
    public /* synthetic */ boolean t1(int i10) {
        return true;
    }

    @Override // tf.i1
    public /* synthetic */ void J1(ArrayList arrayList) {
    }
}
