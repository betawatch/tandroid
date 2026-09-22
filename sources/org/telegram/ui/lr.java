package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class lr implements z60 {
    public final /* synthetic */ e70 a;
    public final /* synthetic */ ur b;

    public lr(ur urVar, e70 e70Var) {
        this.b = urVar;
        this.a = e70Var;
    }

    @Override // org.telegram.ui.z60
    public final void i(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.z60
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        ur urVar = this.b;
        urVar.getMessagesController().addUsersToChat(urVar.r, urVar, arrayList, i10, new g3(this, 2), new kr(0), null);
    }
}
