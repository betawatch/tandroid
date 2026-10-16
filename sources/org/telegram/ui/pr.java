package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pr implements e70 {
    public final /* synthetic */ j70 a;
    public final /* synthetic */ yr b;

    public pr(yr yrVar, j70 j70Var) {
        this.b = yrVar;
        this.a = j70Var;
    }

    @Override // org.telegram.ui.e70
    public final void h(TLRPC.User user) {
        this.b.t0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // org.telegram.ui.e70
    public final void i(int i10, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        yr yrVar = this.b;
        yrVar.getMessagesController().addUsersToChat(yrVar.r, yrVar, arrayList, i10, new j3(this, 2), new or(0), null);
    }
}
