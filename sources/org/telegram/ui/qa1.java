package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class qa1 extends nq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ za1 e1;
    public final /* synthetic */ sa1 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa1(sa1 sa1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, za1 za1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = sa1Var;
        this.d1 = zArr;
        this.e1 = za1Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            za1 za1Var = this.e1;
            if (org.telegram.ui.Components.xc.a(za1Var)) {
                org.telegram.ui.Components.xc.C(za1Var, this.f1.a.first_name).j();
            }
        }
    }
}
