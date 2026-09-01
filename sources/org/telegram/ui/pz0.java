package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pz0 implements hq {
    public final /* synthetic */ py a;
    public final /* synthetic */ qz0 b;

    public pz0(qz0 qz0Var, py pyVar) {
        this.b = qz0Var;
        this.a = pyVar;
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        qz0 qz0Var = this.b;
        qz0Var.b.K1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = qz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = qz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        qz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
    }
}
