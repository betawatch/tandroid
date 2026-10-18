package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
