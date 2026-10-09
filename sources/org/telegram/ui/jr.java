package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jr implements x60 {
    public final /* synthetic */ c70 a;
    public final /* synthetic */ tr b;

    public jr(tr trVar, c70 c70Var) {
        this.b = trVar;
        this.a = c70Var;
    }

    @Override // org.telegram.ui.x60
    public final void i(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.x60
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        tr trVar = this.b;
        trVar.getMessagesController().addUsersToChat(trVar.r, trVar, arrayList, i10, new h3(this, 2), new ir(0), null);
    }
}
