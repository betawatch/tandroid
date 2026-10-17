package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ar implements i60 {
    public final /* synthetic */ n60 a;
    public final /* synthetic */ jr b;

    public ar(jr jrVar, n60 n60Var) {
        this.b = jrVar;
        this.a = n60Var;
    }

    @Override // org.telegram.ui.i60
    public final void h(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.i60
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.b;
        jrVar.getMessagesController().addUsersToChat(jrVar.r, jrVar, arrayList, i10, new j3(this, 2), new zq(0), null);
    }
}
