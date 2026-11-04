package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dq implements m40 {
    public final /* synthetic */ r40 a;
    public final /* synthetic */ nq b;

    public dq(nq nqVar, r40 r40Var) {
        this.b = nqVar;
        this.a = r40Var;
    }

    @Override // org.telegram.ui.m40
    public final void e(TLRPC.User user) {
        this.b.y0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.m40
    public final void h(int i3, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        nq nqVar = this.b;
        nqVar.getMessagesController().o(nqVar.n, nqVar, arrayList, i3, new g3(this, 2), new cq(0), null);
    }
}
