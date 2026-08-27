package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class br implements j60 {
    public final /* synthetic */ o60 a;
    public final /* synthetic */ lr b;

    public br(lr lrVar, o60 o60Var) {
        this.b = lrVar;
        this.a = o60Var;
    }

    @Override // org.telegram.ui.j60
    public final void i(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.j60
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        lr lrVar = this.b;
        lrVar.getMessagesController().addUsersToChat(lrVar.r, lrVar, arrayList, i10, new l3(this, 2), new ar(0), null);
    }
}
