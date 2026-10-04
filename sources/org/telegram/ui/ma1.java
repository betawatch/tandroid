package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ma1 extends mq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ va1 e1;
    public final /* synthetic */ oa1 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma1(oa1 oa1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, va1 va1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = oa1Var;
        this.d1 = zArr;
        this.e1 = va1Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            va1 va1Var = this.e1;
            if (org.telegram.ui.Components.yc.a(va1Var)) {
                org.telegram.ui.Components.yc.C(va1Var, this.f1.a.first_name).j();
            }
        }
    }
}
