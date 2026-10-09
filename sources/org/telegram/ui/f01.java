package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f01 implements kq {
    public final /* synthetic */ ty a;
    public final /* synthetic */ g01 b;

    public f01(g01 g01Var, ty tyVar) {
        this.b = g01Var;
        this.a = tyVar;
    }

    @Override // org.telegram.ui.kq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        g01 g01Var = this.b;
        g01Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = g01Var.b.getNotificationCenter();
        ProfileActivity profileActivity = g01Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        g01Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.kq
    public final void a(TLRPC.User user) {
    }
}
