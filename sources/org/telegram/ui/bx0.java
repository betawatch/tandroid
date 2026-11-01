package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class bx0 implements fq {
    public final /* synthetic */ zx a;
    public final /* synthetic */ cx0 b;

    public bx0(cx0 cx0Var, zx zxVar) {
        this.b = cx0Var;
        this.a = zxVar;
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.M1 = true;
        this.a.removeSelfFromStack();
        org.telegram.messenger.at notificationCenter = profileActivity.getNotificationCenter();
        int i11 = org.telegram.messenger.at.t;
        notificationCenter.n(profileActivity, i11);
        profileActivity.getNotificationCenter().k(i11, new Object[0]);
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
    }
}
