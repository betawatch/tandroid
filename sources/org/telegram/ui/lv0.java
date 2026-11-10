package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lv0 extends mp {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ TLRPC.User d1;
    public final /* synthetic */ ProfileActivity e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.e1 = profileActivity;
        this.c1 = zArr;
        this.d1 = user;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.c1[0]) {
            ProfileActivity profileActivity = this.e1;
            if (org.telegram.ui.Components.gc.a(profileActivity)) {
                org.telegram.ui.Components.gc.C(this.d1.first_name, profileActivity).j();
            }
        }
    }
}
