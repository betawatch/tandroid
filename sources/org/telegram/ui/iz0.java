package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class iz0 extends iq {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ TLRPC.User d1;
    public final /* synthetic */ ProfileActivity e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.e1 = profileActivity;
        this.c1 = zArr;
        this.d1 = user;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.c1[0]) {
            ProfileActivity profileActivity = this.e1;
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.C(profileActivity, this.d1.first_name).j();
            }
        }
    }
}
