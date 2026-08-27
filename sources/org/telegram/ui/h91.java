package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h91 extends dq {
    public final /* synthetic */ boolean[] Z0;
    public final /* synthetic */ q91 a1;
    public final /* synthetic */ j91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(j91 j91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, q91 q91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.b1 = j91Var;
        this.Z0 = zArr;
        this.a1 = q91Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            q91 q91Var = this.a1;
            if (org.telegram.ui.Components.mc.a(q91Var)) {
                org.telegram.ui.Components.mc.C(q91Var, this.b1.a.first_name).j();
            }
        }
    }
}
