package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements org.telegram.ui.Cells.a5, tf.j1 {
    public final /* synthetic */ or a;

    public /* synthetic */ nr(or orVar) {
        this.a = orVar;
    }

    @Override // tf.j1
    public /* synthetic */ a0.h I() {
        return null;
    }

    @Override // tf.j1
    public /* synthetic */ boolean Q(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        or orVar = this.a;
        TLObject E = orVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return orVar.y.h0((TLRPC.ChannelParticipant) E, !z4, b5Var);
    }

    @Override // tf.j1
    public void g(int i10) {
        or orVar = this.a;
        pr prVar = orVar.y;
        if (orVar.h.e()) {
            return;
        }
        int i11 = orVar.r;
        orVar.l();
        if (orVar.r > i11) {
            prVar.y0(i11);
        }
        if (orVar.s || orVar.r != 0 || i10 == 0) {
            return;
        }
        prVar.b.e(false, true);
    }

    @Override // tf.j1
    public /* synthetic */ a0.h t() {
        return null;
    }

    @Override // tf.j1
    public /* synthetic */ void T(ArrayList arrayList) {
    }
}
