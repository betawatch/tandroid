package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lz0 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.ui0 {
    public final /* synthetic */ g11 a;

    public /* synthetic */ lz0(g11 g11Var) {
        this.a = g11Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        g11 g11Var = this.a;
        int i10 = g11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i10);
        ArrayList[] arrayListArr = b02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.E0[0] = 0;
        b02.getMessagesStorage().a.c(new org.telegram.messenger.xf(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        g11Var.B(false, true, true);
    }

    @Override // org.telegram.ui.Components.ui0
    public void h() {
        this.a.m();
    }
}
