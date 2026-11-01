package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.vj0 {
    public final /* synthetic */ g31 a;

    public /* synthetic */ k11(g31 g31Var) {
        this.a = g31Var;
    }

    @Override // org.telegram.ui.Components.vj0
    public void g() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        g31 g31Var = this.a;
        int i11 = g31Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i11);
        ArrayList[] arrayListArr = b02.E0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.D0[0] = 0;
        b02.getMessagesStorage().a.c(new org.telegram.messenger.fg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        g31Var.B(false, true, true);
    }
}
