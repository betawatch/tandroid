package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ka1 extends mq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ ta1 e1;
    public final /* synthetic */ ma1 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka1(ma1 ma1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, ta1 ta1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f1 = ma1Var;
        this.d1 = zArr;
        this.e1 = ta1Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            ta1 ta1Var = this.e1;
            if (org.telegram.ui.Components.yc.a(ta1Var)) {
                org.telegram.ui.Components.yc.C(ta1Var, this.f1.a.first_name).j();
            }
        }
    }
}
