package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gr implements t60 {
    public final /* synthetic */ y60 a;
    public final /* synthetic */ pr b;

    public gr(pr prVar, y60 y60Var) {
        this.b = prVar;
        this.a = y60Var;
    }

    @Override // org.telegram.ui.t60
    public final void h(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.t60
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.b;
        prVar.getMessagesController().addUsersToChat(prVar.r, prVar, arrayList, i10, new j3(this, 2), new fr(0), null);
    }
}
