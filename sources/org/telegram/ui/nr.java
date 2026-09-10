package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nr implements z60 {
    public final /* synthetic */ e70 a;
    public final /* synthetic */ wr b;

    public nr(wr wrVar, e70 e70Var) {
        this.b = wrVar;
        this.a = e70Var;
    }

    @Override // org.telegram.ui.z60
    public final void j(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.z60
    public final void k(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        wr wrVar = this.b;
        wrVar.getMessagesController().addUsersToChat(wrVar.r, wrVar, arrayList, i10, new i3(this, 2), new mr(0), null);
    }
}
