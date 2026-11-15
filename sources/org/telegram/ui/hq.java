package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hq implements r40 {
    public final /* synthetic */ w40 a;
    public final /* synthetic */ qq b;

    public hq(qq qqVar, w40 w40Var) {
        this.b = qqVar;
        this.a = w40Var;
    }

    @Override // org.telegram.ui.r40
    public final void f(TLRPC.User user) {
        this.b.y0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.r40
    public final void i(int i7, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        qq qqVar = this.b;
        qqVar.getMessagesController().o(qqVar.n, qqVar, arrayList, i7, new f3(this, 2), new gq(0), null);
    }
}
