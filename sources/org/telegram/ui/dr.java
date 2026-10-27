package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dr implements o60 {
    public final /* synthetic */ t60 a;
    public final /* synthetic */ mr b;

    public dr(mr mrVar, t60 t60Var) {
        this.b = mrVar;
        this.a = t60Var;
    }

    @Override // org.telegram.ui.o60
    public final void e(TLRPC.User user) {
        this.b.u0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.o60
    public final void f(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        mr mrVar = this.b;
        mrVar.getMessagesController().addUsersToChat(mrVar.n, mrVar, arrayList, i10, new h3(this, 2), new cr(0), null);
    }
}
