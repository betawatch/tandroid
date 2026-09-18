package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
