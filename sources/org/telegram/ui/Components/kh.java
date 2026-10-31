package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kh implements vi {
    public final /* synthetic */ bi a;

    public kh(bi biVar) {
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.vi
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.un unVar = (org.telegram.ui.un) this.a.W1;
        if (unVar.n7()) {
            org.telegram.messenger.oz g10 = org.telegram.messenger.oz.g(user, unVar.j6, unVar.D5, unVar.l4, null, null, z10, i10, 0);
            g10.K = unVar.P8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j10;
            g10.R = unVar.a9();
            g10.T = unVar.w5;
            unVar.getSendMessagesHelper().r0(g10);
            unVar.F6();
        }
    }

    @Override // org.telegram.ui.Components.vi
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.un) this.a.W1).vb(arrayList, str, z10, i10, j10, z11);
    }
}
