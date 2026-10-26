package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n91 extends gq {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ w91 d1;
    public final /* synthetic */ p91 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(p91 p91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, w91 w91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.e1 = p91Var;
        this.c1 = zArr;
        this.d1 = w91Var;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.c1[0]) {
            w91 w91Var = this.d1;
            if (org.telegram.ui.Components.wc.a(w91Var)) {
                org.telegram.ui.Components.wc.C(w91Var, this.e1.a.first_name).j();
            }
        }
    }
}
