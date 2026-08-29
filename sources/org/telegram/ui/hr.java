package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements org.telegram.ui.Cells.y4, rf.j1 {
    public final /* synthetic */ ir a;

    @Override // rf.j1
    public /* synthetic */ boolean A(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.y4
    public boolean d(org.telegram.ui.Cells.z4 z4Var, boolean z10) {
        int intValue = ((Integer) z4Var.getTag()).intValue();
        ir irVar = this.a;
        TLObject E = irVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return irVar.y.h0((TLRPC.ChannelParticipant) E, !z10, z4Var);
    }

    @Override // rf.j1
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

    @Override // rf.j1
    public /* synthetic */ a0.h q() {
        return null;
    }

    @Override // rf.j1
    public /* synthetic */ a0.h t() {
        return null;
    }

    @Override // rf.j1
    public /* synthetic */ void E(ArrayList arrayList) {
    }
}
