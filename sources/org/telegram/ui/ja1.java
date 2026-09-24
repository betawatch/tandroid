package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
            if (org.telegram.ui.Components.yc.a(sa1Var)) {
                org.telegram.ui.Components.yc.C(sa1Var, this.f1.a.first_name).j();
            }
        }
    }
}
