package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
