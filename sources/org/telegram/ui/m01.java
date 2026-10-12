package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m01 implements qq {
    public final /* synthetic */ yy a;
    public final /* synthetic */ n01 b;

    public m01(n01 n01Var, yy yyVar) {
        this.b = n01Var;
        this.a = yyVar;
    }

    @Override // org.telegram.ui.qq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        n01 n01Var = this.b;
        n01Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = n01Var.b.getNotificationCenter();
        ProfileActivity profileActivity = n01Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        n01Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.qq
    public final void a(TLRPC.User user) {
    }
}
