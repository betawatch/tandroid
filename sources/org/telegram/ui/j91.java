package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j91 extends bq {
    public final /* synthetic */ boolean[] Z0;
    public final /* synthetic */ s91 a1;
    public final /* synthetic */ l91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j91(l91 l91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, s91 s91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.b1 = l91Var;
        this.Z0 = zArr;
        this.a1 = s91Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            s91 s91Var = this.a1;
            if (org.telegram.ui.Components.oc.a(s91Var)) {
                org.telegram.ui.Components.oc.C(s91Var, this.b1.a.first_name).j();
            }
        }
    }
}
