package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class hv0 extends kp {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ TLRPC.User d1;
    public final /* synthetic */ ProfileActivity e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.e1 = profileActivity;
        this.c1 = zArr;
        this.d1 = user;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.c1[0]) {
            ProfileActivity profileActivity = this.e1;
            if (org.telegram.ui.Components.hc.a(profileActivity)) {
                org.telegram.ui.Components.hc.C(this.d1.first_name, profileActivity).j();
            }
        }
    }
}
