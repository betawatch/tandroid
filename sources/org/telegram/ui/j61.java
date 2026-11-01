package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j61 extends iq {
    public final /* synthetic */ boolean[] c1;
    public final /* synthetic */ s61 d1;
    public final /* synthetic */ l61 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j61(l61 l61Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, s61 s61Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.e1 = l61Var;
        this.c1 = zArr;
        this.d1 = s61Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.c1[0]) {
            s61 s61Var = this.d1;
            if (org.telegram.ui.Components.cc.a(s61Var)) {
                org.telegram.ui.Components.cc.C(this.e1.a.first_name, s61Var).j();
            }
        }
    }
}
