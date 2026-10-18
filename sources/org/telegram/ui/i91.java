package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class i91 extends dq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ r91 e1;
    public final /* synthetic */ k91 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(k91 k91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, r91 r91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = k91Var;
        this.d1 = zArr;
        this.e1 = r91Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            r91 r91Var = this.e1;
            if (org.telegram.ui.Components.xc.a(r91Var)) {
                org.telegram.ui.Components.xc.C(r91Var, this.f1.a.first_name).j();
            }
        }
    }
}
