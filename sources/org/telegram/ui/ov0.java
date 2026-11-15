package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ov0 implements jp {
    public final /* synthetic */ yw a;
    public final /* synthetic */ pv0 b;

    public ov0(pv0 pv0Var, yw ywVar) {
        this.b = pv0Var;
        this.a = ywVar;
    }

    @Override // org.telegram.ui.jp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.N1 = true;
        this.a.removeSelfFromStack();
        org.telegram.messenger.ns notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.ns.t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
    }
}
