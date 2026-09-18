package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lr implements b70 {
    public final /* synthetic */ g70 a;
    public final /* synthetic */ ur b;

    public lr(ur urVar, g70 g70Var) {
        this.b = urVar;
        this.a = g70Var;
    }

    @Override // org.telegram.ui.b70
    public final void i(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.b70
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        ur urVar = this.b;
        urVar.getMessagesController().addUsersToChat(urVar.r, urVar, arrayList, i10, new g3(this, 2), new kr(0), null);
    }
}
