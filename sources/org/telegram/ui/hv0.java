package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hv0 implements fp {
    public final /* synthetic */ uw a;
    public final /* synthetic */ iv0 b;

    public hv0(iv0 iv0Var, uw uwVar) {
        this.b = iv0Var;
        this.a = uwVar;
    }

    @Override // org.telegram.ui.fp
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.N1 = true;
        this.a.removeSelfFromStack();
        org.telegram.messenger.hs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.hs.t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override // org.telegram.ui.fp
    public final void a(TLRPC.User user) {
    }
}
