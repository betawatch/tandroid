package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ir implements y60 {
    public final /* synthetic */ d70 a;
    public final /* synthetic */ rr b;

    public ir(rr rrVar, d70 d70Var) {
        this.b = rrVar;
        this.a = d70Var;
    }

    @Override // org.telegram.ui.y60
    public final void c(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.y60
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        rr rrVar = this.b;
        rrVar.getMessagesController().addUsersToChat(rrVar.r, rrVar, arrayList, i10, new h3(this, 2), new hr(0), null);
    }
}
