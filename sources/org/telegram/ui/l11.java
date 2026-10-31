package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.uj0 {
    public final /* synthetic */ i31 a;

    public /* synthetic */ l11(i31 i31Var) {
        this.a = i31Var;
    }

    @Override // org.telegram.ui.Components.uj0
    public void g() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        i31 i31Var = this.a;
        int i11 = i31Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
        ArrayList[] arrayListArr = b02.E0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.D0[0] = 0;
        b02.getMessagesStorage().a.c(new org.telegram.messenger.eg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        i31Var.B(false, true, true);
    }
}
