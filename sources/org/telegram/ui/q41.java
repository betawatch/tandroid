package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q41 extends mp {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ z41 e1;
    public final /* synthetic */ s41 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(s41 s41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, z41 z41Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = s41Var;
        this.d1 = zArr;
        this.e1 = z41Var;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            z41 z41Var = this.e1;
            if (org.telegram.ui.Components.cc.a(z41Var)) {
                org.telegram.ui.Components.cc.C(this.f1.a.first_name, z41Var).j();
            }
        }
    }
}
