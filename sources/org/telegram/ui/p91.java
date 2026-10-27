package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p91 extends iq {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ y91 d1;
    public final /* synthetic */ r91 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p91(r91 r91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, y91 y91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.e1 = r91Var;
        this.c1 = zArr;
        this.d1 = y91Var;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.c1[0]) {
            y91 y91Var = this.d1;
            if (org.telegram.ui.Components.wc.a(y91Var)) {
                org.telegram.ui.Components.wc.C(y91Var, this.e1.a.first_name).j();
            }
        }
    }
}
