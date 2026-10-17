package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements org.telegram.ui.Cells.z4, hg.z1 {
    public final /* synthetic */ ir a;

    @Override // hg.z1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ir irVar = this.a;
        TLObject E = irVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return irVar.y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
    }

    @Override // hg.z1
    public void f(int i10) {
        ir irVar = this.a;
        jr jrVar = irVar.y;
        if (irVar.h.e()) {
            return;
        }
        int i11 = irVar.r;
        irVar.l();
        if (irVar.r > i11) {
            jrVar.y0(i11);
        }
        if (irVar.s || irVar.r != 0 || i10 == 0) {
            return;
        }
        jrVar.b.e(false, true);
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ void Y(ArrayList arrayList) {
    }
}
