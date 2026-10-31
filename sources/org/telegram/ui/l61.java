package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l61 extends iq {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ u61 d1;
    public final /* synthetic */ n61 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(n61 n61Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, u61 u61Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.e1 = n61Var;
        this.c1 = zArr;
        this.d1 = u61Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.c1[0]) {
            u61 u61Var = this.d1;
            if (org.telegram.ui.Components.cc.a(u61Var)) {
                org.telegram.ui.Components.cc.C(this.e1.a.first_name, u61Var).j();
            }
        }
    }
}
