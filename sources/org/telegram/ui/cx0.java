package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cx0 implements fq {
    public final /* synthetic */ ay a;
    public final /* synthetic */ dx0 b;

    public cx0(dx0 dx0Var, ay ayVar) {
        this.b = dx0Var;
        this.a = ayVar;
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.M1 = true;
        this.a.removeSelfFromStack();
        org.telegram.messenger.zs notificationCenter = profileActivity.getNotificationCenter();
        int i11 = org.telegram.messenger.zs.t;
        notificationCenter.n(profileActivity, i11);
        profileActivity.getNotificationCenter().k(i11, new Object[0]);
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
    }
}
