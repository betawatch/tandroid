package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ea1 extends kq {
    public final /* synthetic */ boolean[] a1;
    public final /* synthetic */ na1 b1;
    public final /* synthetic */ ga1 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea1(ga1 ga1Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, boolean[] zArr, na1 na1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z4, null);
        this.c1 = ga1Var;
        this.a1 = zArr;
        this.b1 = na1Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.a1[0]) {
            na1 na1Var = this.b1;
            if (org.telegram.ui.Components.qc.a(na1Var)) {
                org.telegram.ui.Components.qc.C(na1Var, this.c1.a.first_name).j();
            }
        }
    }
}
