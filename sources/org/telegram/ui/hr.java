package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hr implements u60 {
    public final /* synthetic */ z60 a;
    public final /* synthetic */ qr b;

    public hr(qr qrVar, z60 z60Var) {
        this.b = qrVar;
        this.a = z60Var;
    }

    @Override // org.telegram.ui.u60
    public final void h(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.u60
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        qr qrVar = this.b;
        qrVar.getMessagesController().addUsersToChat(qrVar.r, qrVar, arrayList, i10, new j3(this, 2), new gr(0), null);
    }
}
