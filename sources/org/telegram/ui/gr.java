package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gr implements p50 {
    public final /* synthetic */ u50 a;
    public final /* synthetic */ pr b;

    public gr(pr prVar, u50 u50Var) {
        this.b = prVar;
        this.a = u50Var;
    }

    @Override // org.telegram.ui.p50
    public final void e(TLRPC.User user) {
        this.b.y0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.p50
    public final void g(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.b;
        prVar.getMessagesController().o(prVar.n, prVar, arrayList, i10, new f3(this, 2), new fr(0), null);
    }
}
