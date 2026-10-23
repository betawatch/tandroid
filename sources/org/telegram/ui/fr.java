package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements org.telegram.ui.Cells.z4, hg.z1 {
    public final /* synthetic */ gr a;

    @Override // hg.z1
    public /* synthetic */ a0.h G() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        gr grVar = this.a;
        TLObject E = grVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return grVar.y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
    }

    @Override // hg.z1
    public void f(int i10) {
        gr grVar = this.a;
        hr hrVar = grVar.y;
        if (grVar.h.e()) {
            return;
        }
        int i11 = grVar.r;
        grVar.l();
        if (grVar.r > i11) {
            hrVar.y0(i11);
        }
        if (grVar.s || grVar.r != 0 || i10 == 0) {
            return;
        }
        hrVar.b.e(false, true);
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
    }
}
