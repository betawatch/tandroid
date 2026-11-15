package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
