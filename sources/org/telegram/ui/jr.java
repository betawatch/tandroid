package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class jr implements z60 {
    public final /* synthetic */ e70 a;
    public final /* synthetic */ sr b;

    public jr(sr srVar, e70 e70Var) {
        this.b = srVar;
        this.a = e70Var;
    }

    @Override // org.telegram.ui.z60
    public final void g(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.z60
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        sr srVar = this.b;
        srVar.getMessagesController().addUsersToChat(srVar.r, srVar, arrayList, i10, new g3(this, 2), new ir(0), null);
    }
}
