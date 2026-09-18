package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jr implements z60 {
    public final /* synthetic */ e70 a;
    public final /* synthetic */ sr b;

    public jr(sr srVar, e70 e70Var) {
        this.b = srVar;
        this.a = e70Var;
    }

    @Override // org.telegram.ui.z60
    public final void g(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.z60
    public final void j(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        sr srVar = this.b;
        srVar.getMessagesController().addUsersToChat(srVar.r, srVar, arrayList, i10, new g3(this, 2), new ir(0), null);
    }
}
