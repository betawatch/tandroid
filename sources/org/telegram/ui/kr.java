package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements org.telegram.ui.Cells.e5, ig.z1 {
    public final /* synthetic */ lr a;

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.Cells.e5
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        int intValue = ((Integer) f5Var.getTag()).intValue();
        lr lrVar = this.a;
        TLObject E = lrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return lrVar.y.i0((TLRPC.ChannelParticipant) E, !z10, f5Var);
    }

    @Override // ig.z1
    public void f(int i10) {
        lr lrVar = this.a;
        mr mrVar = lrVar.y;
        if (lrVar.h.e()) {
            return;
        }
        int i11 = lrVar.r;
        lrVar.l();
        if (lrVar.r > i11) {
            mrVar.z0(i11);
        }
        if (lrVar.s || lrVar.r != 0 || i10 == 0) {
            return;
        }
        mrVar.b.e(false, true);
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
