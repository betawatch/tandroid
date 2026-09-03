package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fa1 extends lq {
    public final /* synthetic */ boolean[] a1;
    public final /* synthetic */ oa1 b1;
    public final /* synthetic */ ha1 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa1(ha1 ha1Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, boolean[] zArr, oa1 oa1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z4, null);
        this.c1 = ha1Var;
        this.a1 = zArr;
        this.b1 = oa1Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.a1[0]) {
            oa1 oa1Var = this.b1;
            if (org.telegram.ui.Components.qc.a(oa1Var)) {
                org.telegram.ui.Components.qc.C(oa1Var, this.c1.a.first_name).j();
            }
        }
    }
}
