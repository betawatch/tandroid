package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
