package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class kz0 implements aq {
    public final /* synthetic */ ey a;
    public final /* synthetic */ lz0 b;

    public kz0(lz0 lz0Var, ey eyVar) {
        this.b = lz0Var;
        this.a = eyVar;
    }

    @Override // org.telegram.ui.aq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        lz0 lz0Var = this.b;
        lz0Var.b.O1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = lz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = lz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        lz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.aq
    public final void a(TLRPC.User user) {
    }
}
