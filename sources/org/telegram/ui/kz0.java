package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kz0 extends kq {
    public final /* synthetic */ boolean[] a1;
    public final /* synthetic */ TLRPC.User b1;
    public final /* synthetic */ ProfileActivity c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.c1 = profileActivity;
        this.a1 = zArr;
        this.b1 = user;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.a1[0]) {
            ProfileActivity profileActivity = this.c1;
            if (org.telegram.ui.Components.qc.a(profileActivity)) {
                org.telegram.ui.Components.qc.C(profileActivity, this.b1.first_name).j();
            }
        }
    }
}
