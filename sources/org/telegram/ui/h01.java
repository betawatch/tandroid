package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class h01 implements nq {
    public final /* synthetic */ uy a;
    public final /* synthetic */ i01 b;

    public h01(i01 i01Var, uy uyVar) {
        this.b = i01Var;
        this.a = uyVar;
    }

    @Override // org.telegram.ui.nq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        i01 i01Var = this.b;
        i01Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = i01Var.b.getNotificationCenter();
        ProfileActivity profileActivity = i01Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        i01Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.nq
    public final void a(TLRPC.User user) {
    }
}
