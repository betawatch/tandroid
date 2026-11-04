package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i41 extends ip {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ r41 e1;
    public final /* synthetic */ k41 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(k41 k41Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, r41 r41Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = k41Var;
        this.d1 = zArr;
        this.e1 = r41Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            r41 r41Var = this.e1;
            if (org.telegram.ui.Components.fc.a(r41Var)) {
                org.telegram.ui.Components.fc.C(this.f1.a.first_name, r41Var).j();
            }
        }
    }
}
