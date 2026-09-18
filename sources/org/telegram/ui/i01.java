package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i01 implements mq {
    public final /* synthetic */ wy a;
    public final /* synthetic */ j01 b;

    public i01(j01 j01Var, wy wyVar) {
        this.b = j01Var;
        this.a = wyVar;
    }

    @Override // org.telegram.ui.mq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        j01 j01Var = this.b;
        j01Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = j01Var.b.getNotificationCenter();
        ProfileActivity profileActivity = j01Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        j01Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.mq
    public final void a(TLRPC.User user) {
    }
}
