package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
