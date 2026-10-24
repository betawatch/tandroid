package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class l91 extends dq {
    public final /* synthetic */ boolean[] e1;
    public final /* synthetic */ u91 f1;
    public final /* synthetic */ n91 g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(n91 n91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, u91 u91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.g1 = n91Var;
        this.e1 = zArr;
        this.f1 = u91Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.e1[0]) {
            u91 u91Var = this.f1;
            if (org.telegram.ui.Components.xc.a(u91Var)) {
                org.telegram.ui.Components.xc.C(u91Var, this.g1.a.first_name).j();
            }
        }
    }
}
