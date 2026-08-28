package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr implements org.telegram.ui.Cells.a5, of.u1 {
    public final /* synthetic */ ir a;

    public /* synthetic */ gr(ir irVar) {
        this.a = irVar;
    }

    @Override // of.u1
    public /* synthetic */ a0.h O() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        ir irVar = this.a;
        TLObject E = irVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return irVar.y.g0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // of.u1
    public void e(int i9) {
        ir irVar = this.a;
        jr jrVar = irVar.y;
        if (irVar.h.e()) {
            return;
        }
        int i10 = irVar.r;
        irVar.l();
        if (irVar.r > i10) {
            jrVar.x0(i10);
        }
        if (irVar.s || irVar.r != 0 || i9 == 0) {
            return;
        }
        jrVar.b.e(false, true);
    }

    @Override // of.u1
    public /* synthetic */ boolean p0(int i9) {
        return true;
    }

    @Override // of.u1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // of.u1
    public /* synthetic */ void H0(ArrayList arrayList) {
    }
}
