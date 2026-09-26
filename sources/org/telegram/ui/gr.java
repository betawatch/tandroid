package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gr implements u60 {
    public final /* synthetic */ z60 a;
    public final /* synthetic */ pr b;

    public gr(pr prVar, z60 z60Var) {
        this.b = prVar;
        this.a = z60Var;
    }

    @Override // org.telegram.ui.u60
    public final void g(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.u60
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.b;
        prVar.getMessagesController().addUsersToChat(prVar.r, prVar, arrayList, i10, new h3(this, 2), new fr(0), null);
    }
}
