package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir implements org.telegram.ui.Cells.e5, ig.z1 {
    public final /* synthetic */ jr a;

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.Cells.e5
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        int intValue = ((Integer) f5Var.getTag()).intValue();
        jr jrVar = this.a;
        TLObject E = jrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return jrVar.y.i0((TLRPC.ChannelParticipant) E, !z10, f5Var);
    }

    @Override // ig.z1
    public void f(int i10) {
        jr jrVar = this.a;
        kr krVar = jrVar.y;
        if (jrVar.h.e()) {
            return;
        }
        int i11 = jrVar.r;
        jrVar.l();
        if (jrVar.r > i11) {
            krVar.z0(i11);
        }
        if (jrVar.s || jrVar.r != 0 || i10 == 0) {
            return;
        }
        krVar.b.e(false, true);
    }

    @Override // ig.z1
    public /* synthetic */ boolean k0(int i10) {
        return true;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // ig.z1
    public /* synthetic */ void p0(ArrayList arrayList) {
    }
}
