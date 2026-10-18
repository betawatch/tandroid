package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
