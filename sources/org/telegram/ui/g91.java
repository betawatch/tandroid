package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class g91 extends bq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ p91 e1;
    public final /* synthetic */ i91 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g91(i91 i91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, p91 p91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = i91Var;
        this.d1 = zArr;
        this.e1 = p91Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            p91 p91Var = this.e1;
            if (org.telegram.ui.Components.xc.a(p91Var)) {
                org.telegram.ui.Components.xc.C(p91Var, this.f1.a.first_name).j();
            }
        }
    }
}
