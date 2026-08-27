package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cz0 implements aq {
    public final /* synthetic */ gy a;
    public final /* synthetic */ dz0 b;

    public cz0(dz0 dz0Var, gy gyVar) {
        this.b = dz0Var;
        this.a = gyVar;
    }

    @Override // org.telegram.ui.aq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        dz0 dz0Var = this.b;
        dz0Var.b.J1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = dz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = dz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        dz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.aq
    public final void a(TLRPC.User user) {
    }
}
