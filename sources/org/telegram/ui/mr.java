package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class mr implements a70 {
    public final /* synthetic */ f70 a;
    public final /* synthetic */ vr b;

    public mr(vr vrVar, f70 f70Var) {
        this.b = vrVar;
        this.a = f70Var;
    }

    @Override // org.telegram.ui.a70
    public final void i(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.a70
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        vr vrVar = this.b;
        vrVar.getMessagesController().addUsersToChat(vrVar.r, vrVar, arrayList, i10, new h3(this, 2), new lr(0), null);
    }
}
