package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ja1 extends kq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ sa1 e1;
    public final /* synthetic */ la1 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(la1 la1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, sa1 sa1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = la1Var;
        this.d1 = zArr;
        this.e1 = sa1Var;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            sa1 sa1Var = this.e1;
            if (org.telegram.ui.Components.xc.a(sa1Var)) {
                org.telegram.ui.Components.xc.C(sa1Var, this.f1.a.first_name).j();
            }
        }
    }
}
