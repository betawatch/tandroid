package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hr implements w60 {
    public final /* synthetic */ b70 a;
    public final /* synthetic */ qr b;

    public hr(qr qrVar, b70 b70Var) {
        this.b = qrVar;
        this.a = b70Var;
    }

    @Override // org.telegram.ui.w60
    public final void i(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.w60
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        qr qrVar = this.b;
        qrVar.getMessagesController().addUsersToChat(qrVar.r, qrVar, arrayList, i10, new h3(this, 2), new gr(0), null);
    }
}
