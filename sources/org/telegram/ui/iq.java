package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
