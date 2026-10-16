package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l01 implements qq {
    public final /* synthetic */ yy a;
    public final /* synthetic */ m01 b;

    public l01(m01 m01Var, yy yyVar) {
        this.b = m01Var;
        this.a = yyVar;
    }

    @Override // org.telegram.ui.qq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        m01 m01Var = this.b;
        m01Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = m01Var.b.getNotificationCenter();
        ProfileActivity profileActivity = m01Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        m01Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.qq
    public final void a(TLRPC.User user) {
    }
}
