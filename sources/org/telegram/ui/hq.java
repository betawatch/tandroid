package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hq implements t40 {
    public final /* synthetic */ y40 a;
    public final /* synthetic */ qq b;

    public hq(qq qqVar, y40 y40Var) {
        this.b = qqVar;
        this.a = y40Var;
    }

    @Override // org.telegram.ui.t40
    public final void e(TLRPC.User user) {
        this.b.y0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.t40
    public final void f(int i7, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        qq qqVar = this.b;
        qqVar.getMessagesController().o(qqVar.n, qqVar, arrayList, i7, new f3(this, 2), new gq(0), null);
    }
}
