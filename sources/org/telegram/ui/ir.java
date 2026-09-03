package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ir implements v60 {
    public final /* synthetic */ a70 a;
    public final /* synthetic */ rr b;

    public ir(rr rrVar, a70 a70Var) {
        this.b = rrVar;
        this.a = a70Var;
    }

    @Override // org.telegram.ui.v60
    public final void h(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.v60
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        rr rrVar = this.b;
        rrVar.getMessagesController().addUsersToChat(rrVar.r, rrVar, arrayList, i10, new l3(this, 2), new hr(0), null);
    }
}
