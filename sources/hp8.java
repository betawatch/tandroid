// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hp8 extends ke2 {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ TLRPC.User e1;
    public final /* synthetic */ ProfileActivity f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp8(ProfileActivity profileActivity, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean[] zArr, TLRPC.User user) {
        super(j, j2, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i, true, false, null);
        this.f1 = profileActivity;
        this.d1 = zArr;
        this.e1 = user;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            ProfileActivity profileActivity = this.f1;
            if (c41.a(profileActivity)) {
                c41.C(this.e1.first_name, profileActivity).j();
            }
        }
    }
}
