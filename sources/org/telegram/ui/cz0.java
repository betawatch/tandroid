package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cz0 implements yp {
    public final /* synthetic */ dy a;
    public final /* synthetic */ dz0 b;

    public cz0(dz0 dz0Var, dy dyVar) {
        this.b = dz0Var;
        this.a = dyVar;
    }

    @Override // org.telegram.ui.yp
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        dz0 dz0Var = this.b;
        dz0Var.b.J1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = dz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = dz0Var.b;
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        dz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
    }
}
