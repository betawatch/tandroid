package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ar implements k60 {
    public final /* synthetic */ p60 a;
    public final /* synthetic */ jr b;

    public ar(jr jrVar, p60 p60Var) {
        this.b = jrVar;
        this.a = p60Var;
    }

    @Override // org.telegram.ui.k60
    public final void h(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.k60
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.b;
        jrVar.getMessagesController().addUsersToChat(jrVar.r, jrVar, arrayList, i10, new i3(this, 2), new zq(0), null);
    }
}
