package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gr implements q50 {
    public final /* synthetic */ v50 a;
    public final /* synthetic */ pr b;

    public gr(pr prVar, v50 v50Var) {
        this.b = prVar;
        this.a = v50Var;
    }

    @Override // org.telegram.ui.q50
    public final void e(TLRPC.User user) {
        this.b.x0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.q50
    public final void g(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.b;
        prVar.getMessagesController().o(prVar.n, prVar, arrayList, i10, new f3(this, 2), new fr(0), null);
    }
}
