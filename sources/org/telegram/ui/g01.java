package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g01 implements kq {
    public final /* synthetic */ uy a;
    public final /* synthetic */ h01 b;

    public g01(h01 h01Var, uy uyVar) {
        this.b = h01Var;
        this.a = uyVar;
    }

    @Override // org.telegram.ui.kq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        h01 h01Var = this.b;
        h01Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = h01Var.b.getNotificationCenter();
        ProfileActivity profileActivity = h01Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        h01Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.kq
    public final void a(TLRPC.User user) {
    }
}
