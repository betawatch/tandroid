package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mz0 implements aq {
    public final /* synthetic */ ey a;
    public final /* synthetic */ nz0 b;

    public mz0(nz0 nz0Var, ey eyVar) {
        this.b = nz0Var;
        this.a = eyVar;
    }

    @Override // org.telegram.ui.aq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        nz0 nz0Var = this.b;
        nz0Var.b.O1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = nz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = nz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        nz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.aq
    public final void a(TLRPC.User user) {
    }
}
