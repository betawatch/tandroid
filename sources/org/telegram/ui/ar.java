package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ar implements h60 {
    public final /* synthetic */ m60 a;
    public final /* synthetic */ jr b;

    public ar(jr jrVar, m60 m60Var) {
        this.b = jrVar;
        this.a = m60Var;
    }

    @Override // org.telegram.ui.h60
    public final void i(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.h60
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.b;
        jrVar.getMessagesController().addUsersToChat(jrVar.r, jrVar, arrayList, i10, new l3(this, 2), new zq(0), null);
    }
}
