package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m01 implements oq {
    public final /* synthetic */ wy a;
    public final /* synthetic */ n01 b;

    public m01(n01 n01Var, wy wyVar) {
        this.b = n01Var;
        this.a = wyVar;
    }

    @Override // org.telegram.ui.oq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        n01 n01Var = this.b;
        n01Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = n01Var.b.getNotificationCenter();
        ProfileActivity profileActivity = n01Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        n01Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.oq
    public final void a(TLRPC.User user) {
    }
}
