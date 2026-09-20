package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        sr srVar = this.b;
        srVar.getMessagesController().addUsersToChat(srVar.r, srVar, arrayList, i10, new g3(this, 2), new ir(0), null);
    }
}
