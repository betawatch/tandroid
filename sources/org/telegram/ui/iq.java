package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class iq implements u40 {
    public final /* synthetic */ z40 a;
    public final /* synthetic */ rq b;

    public iq(rq rqVar, z40 z40Var) {
        this.b = rqVar;
        this.a = z40Var;
    }

    @Override // org.telegram.ui.u40
    public final void f(TLRPC.User user) {
        this.b.y0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.u40
    public final void i(int i7, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        rq rqVar = this.b;
        rqVar.getMessagesController().o(rqVar.n, rqVar, arrayList, i7, new f3(this, 2), new hq(0), null);
    }
}
