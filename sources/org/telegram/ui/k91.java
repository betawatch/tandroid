package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k91 extends dq {
    public final /* synthetic */ boolean[] Z0;
    public final /* synthetic */ t91 a1;
    public final /* synthetic */ m91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k91(m91 m91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, t91 t91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.b1 = m91Var;
        this.Z0 = zArr;
        this.a1 = t91Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            t91 t91Var = this.a1;
            if (org.telegram.ui.Components.tc.a(t91Var)) {
                org.telegram.ui.Components.tc.C(t91Var, this.b1.a.first_name).j();
            }
        }
    }
}
