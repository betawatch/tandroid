package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class iz0 implements yp {
    public final /* synthetic */ cy a;
    public final /* synthetic */ jz0 b;

    public iz0(jz0 jz0Var, cy cyVar) {
        this.b = jz0Var;
        this.a = cyVar;
    }

    @Override // org.telegram.ui.yp
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        jz0 jz0Var = this.b;
        jz0Var.b.O1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = jz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = jz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        jz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
    }
}
