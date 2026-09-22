package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h01 implements mq {
    public final /* synthetic */ uy a;
    public final /* synthetic */ i01 b;

    public h01(i01 i01Var, uy uyVar) {
        this.b = i01Var;
        this.a = uyVar;
    }

    @Override // org.telegram.ui.mq
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

    @Override // org.telegram.ui.mq
    public final void a(TLRPC.User user) {
    }
}
