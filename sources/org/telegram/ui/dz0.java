package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dz0 extends dq {
    public final /* synthetic */ boolean[] e1;
    public final /* synthetic */ TLRPC.User f1;
    public final /* synthetic */ ProfileActivity g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.g1 = profileActivity;
        this.e1 = zArr;
        this.f1 = user;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.e1[0]) {
            ProfileActivity profileActivity = this.g1;
            if (org.telegram.ui.Components.xc.a(profileActivity)) {
                org.telegram.ui.Components.xc.C(profileActivity, this.f1.first_name).j();
            }
        }
    }
}
